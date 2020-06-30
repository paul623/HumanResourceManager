package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Job;
import com.paul623.javaweb.ex.humanresourcemanagement.service.JobService;
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
public class JobController {
    @Autowired
    JobService jobService;
    // 如果在目录下输入为空，则跳转到指定链接
    @RequestMapping("/job/")
    public ModelAndView index2(ModelAndView mv){
        mv.setViewName("job/list");
        return mv;
    }
    // 如果在目录下输入任何不存在的参数，则跳转到list
    @RequestMapping("/job/{formName}")
    public String index2(String formName){
        String blank = "/job/list";
        return blank;
    }
    @RequestMapping("/job/list")
    public String index(Model model, String content){
        List<Job> job_list = jobService.findAllJob();
        if (content!=null){
            job_list = jobService.findAllJob(content);
        }
        model.addAttribute("list",job_list);
        return "job/list";
    }
    @GetMapping("/job/add")
    public String add(Model model,Integer id){
        if(id!=null){
            Job job = jobService.get_JobInfo(id);
            model.addAttribute("job",job);
        }
        return "/job/add";
    }
    @PostMapping("/job/add")
    public ModelAndView add(ModelAndView mv, @ModelAttribute Job job , Integer id){
        System.out.println(id);
        if(id!=null){
            jobService.update_JobInfo(job);
        }else{
            jobService.insert_JobInfo(job);
        }
        mv.setViewName("redirect:/job/list");
        return mv;
    }
    @RequestMapping("/job/delete")
    public void delete(Integer id){
        System.out.println(id);
        if(id!=null){
            jobService.delete_JobInfo(id);
        }
    }
}
