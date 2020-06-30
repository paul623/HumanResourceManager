package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Dept;
import com.paul623.javaweb.ex.humanresourcemanagement.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping(value="/dept/")
    public ModelAndView index2(ModelAndView mv){
        mv.setViewName("dept/list");
        return mv;
    }
    @RequestMapping(value="/dept/{formName}")
    public String index2(String formName){
        return "/dept/list";
    }
    @RequestMapping("/dept/list")
    public String index(Model model, String content){
        List<Dept> dept_list = deptService.findAllDept();
        if (content!=null){
            dept_list = deptService.findAllDept(content);
        }
        model.addAttribute("list",dept_list);
        return "dept/list";
    }
}
