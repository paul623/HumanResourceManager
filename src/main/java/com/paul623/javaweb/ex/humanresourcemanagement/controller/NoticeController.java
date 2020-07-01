package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Notice;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.User;
import com.paul623.javaweb.ex.humanresourcemanagement.service.NoticeService;
import com.paul623.javaweb.ex.humanresourcemanagement.utils.Constants;
import com.paul623.javaweb.ex.humanresourcemanagement.utils.DateHelper;
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
public class NoticeController {
    @Autowired
    NoticeService noticeService;
    // 如果在目录下输入为空，则跳转到指定链接
    @RequestMapping("/notice/")
    public ModelAndView index2(ModelAndView mv){
        mv.setViewName("notice/list");
        return mv;
    }
    // 如果在目录下输入任何不存在的参数，则跳转到list
    @RequestMapping("/notice/{formName}")
    public String index2(String formName){
        String blank = "/notice/list";
        return blank;
    }
    @RequestMapping("/notice/list")
    public String index(Model model, String content){
        List<Notice> job_list = noticeService.get_NoticeList();
        if (content!=null){
            job_list = noticeService.get_NoticeLikeList(content);
        }
        System.out.println(job_list);
        model.addAttribute("list",job_list);
        return "notice/list";
    }
    @RequestMapping("/notice/list/view")
    public String indexView(Model model, String content){
        List<Notice> job_list = noticeService.get_NoticeList();
        if (content!=null){
            job_list = noticeService.get_NoticeLikeList(content);
        }
        System.out.println(job_list);
        model.addAttribute("list",job_list);
        return "notice/notice-view";
    }
    @GetMapping("/notice/add")
    public String add(Model model,Integer id){
        if(id!=null){
            Notice job = noticeService.get_NoticeInfo(id);
            model.addAttribute("job",job);
        }
        return "/notice/add";
    }
    @PostMapping("/notice/add")
    public ModelAndView add(ModelAndView mv, @ModelAttribute Notice notice , Integer id, HttpSession session){
        User user= (User) session.getAttribute(Constants.USER_SESSION);
        notice.setUser(user);
        notice.setUserId(user.getId());
        notice.setCreateDate(DateHelper.getCurDate());
        if(id!=null){
            noticeService.update_NoticeInfo(notice);
        }else{
            noticeService.insert_NoticeInfo(notice);
        }
        mv.setViewName("redirect:/notice/list");
        return mv;
    }
    @RequestMapping("/notice/delete")
    public void delete(Integer id){
        if(id!=null){
            noticeService.delete_NoticeInfo(id);
        }
    }
}
