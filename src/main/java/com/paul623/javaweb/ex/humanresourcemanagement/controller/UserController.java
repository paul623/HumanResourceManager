package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Employee;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.User;
import com.paul623.javaweb.ex.humanresourcemanagement.service.SumDataService;
import com.paul623.javaweb.ex.humanresourcemanagement.service.UserService;
import com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    SumDataService sumDataService;
    // 如果在目录下输入为空，则跳转到指定链接
    @RequestMapping("/user/")
    public ModelAndView index2(ModelAndView mv){
        mv.setViewName("/user/list");
        return mv;
    }
    @RequestMapping("/login")
    public ModelAndView login(String loginname,
                              String password,
                              int permission,
                              HttpSession session,
                              ModelAndView mv){
        Object temp = userService.login(loginname, password,permission);
        if(temp != null){
            switch (permission){
                case 0:
                    User user=(User)temp;
                    // 将用户保存到HttpSession当中
                    session.setAttribute("sumData",sumDataService.getSumData());
                    session.setAttribute(Constants.USER_SESSION, user);
                    // 客户端跳转到main页面
                    mv.setViewName("redirect:/index");
                    break;
                case 1:
                    Employee employee=(Employee)temp;
                    // 将用户保存到HttpSession当中
                    session.setAttribute("sumData",sumDataService.getSumData());
                    session.setAttribute(Constants.USER_SESSION, employee);
                    // 客户端跳转到main页面
                    mv.setViewName("redirect:/index-normal");
                    break;
            }

        }else{
            // 设置登录失败提示信息
            mv.addObject("message", "登录名或密码错误!请重新输入");
            // 服务器内部跳转到登录页面
            mv.setViewName("forward:/loginForm");
        }
        return mv;
    }
    // 如果在目录下输入任何不存在的参数，则跳转到list
    @RequestMapping("/user/{formName}")
    public String index2(String formName){
        String blank = "/user/list";
        return blank;
    }
    @RequestMapping("/user/list")
    public String index(Model model, String content){
        List<User> job_list = userService.get_UserList();
        if (content!=null){
            job_list = userService.get_UserLikeList(content);
        }
        model.addAttribute("list",job_list);
        return "user/list";
    }
    @GetMapping("/user/add")
    public String add(Model model,Integer id){
        if(id!=null){
            User job = userService.get_UserInfo(id);
            model.addAttribute("job",job);
        }
        return "/user/add";
    }
    @PostMapping("/user/add")
    public ModelAndView add(ModelAndView mv, @ModelAttribute User notice , Integer id){
        if(id!=null){
            userService.update_UserInfo(notice);
        }else{
            userService.insert_UserInfo(notice);
        }
        mv.setViewName("redirect:/user/list");
        return mv;
    }
    @RequestMapping("/user/delete")
    public void delete(Integer id){
        if(id!=null){
            userService.delete_UserInfo(id);
        }
    }
}
