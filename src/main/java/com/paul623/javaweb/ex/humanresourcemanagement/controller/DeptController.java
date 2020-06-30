package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Dept;
import com.paul623.javaweb.ex.humanresourcemanagement.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    DeptService deptService;

    // 如果在目录下输入为空，则跳转到指定链接
    @RequestMapping("/dept/")
    public ModelAndView index2(ModelAndView mv){
        mv.setViewName("dept/list");
        return mv;
    }
    // 如果在目录下输入任何不存在的参数，则跳转到list
    @RequestMapping("/dept/{formName}")
    public String index2( String formName){
//		return formName;
        String blank = "/dept/list";
        return blank;
    }

    @RequestMapping("/dept/list")
    public String index(Model model,String content){
        List<Dept> dept_list = deptService.findAllDept();
        if (content!=null){
            dept_list = deptService.findAllDept(content);
        }
        model.addAttribute("list",dept_list);
        return "dept/list";
    }
    @GetMapping("/dept/add")
    public String add(Model model,Integer id){
        if(id!=null){
            Dept dept = deptService.get_Info(id);
            model.addAttribute("dept",dept);
        }
        return "/dept/add";
    }
    @PostMapping("/dept/add")
    public ModelAndView add(ModelAndView mv, @ModelAttribute Dept dept , Integer id){
        if(id!=null){
            deptService.update_Info(dept);
        }else{
            deptService.addDept(dept);
        }
        mv.setViewName("redirect:/dept/list");
        return mv;
    }
    @RequestMapping("/dept/delete")
    public void delete(Integer id){
        if(id!=null){
            deptService.delete_Info(id);
        }
    }
}
