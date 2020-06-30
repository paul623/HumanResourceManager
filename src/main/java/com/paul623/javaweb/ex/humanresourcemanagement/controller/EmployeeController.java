package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Dept;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.Employee;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.Job;
import com.paul623.javaweb.ex.humanresourcemanagement.service.DeptService;
import com.paul623.javaweb.ex.humanresourcemanagement.service.EmployeeService;
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
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    JobService jobService;
    @Autowired
    DeptService deptService;

    @RequestMapping("/employee/")
    public ModelAndView index2(ModelAndView mv){
        mv.setViewName("employee/list");
        return mv;
    }
    // 如果在目录下输入任何不存在的参数，则跳转到list
    @RequestMapping("/employee/{formName}")
    public String index2(String formName){
        String blank = "/employee/list";
        return blank;
    }
    @RequestMapping("/employee/list")
    public String index(Model model, String content){
        List<Employee> job_list = employeeService.get_EmployeeList();
        if (content!=null){
            job_list = employeeService.get_EmployeeLikeList(content);
        }
        model.addAttribute("list",job_list);
        return "employee/list";
    }
    @GetMapping("/employee/add")
    public String add(Model model,Integer id){
        if(id!=null){
            Employee employee = employeeService.get_EmployeeInfo(id);
            model.addAttribute("job",employee);
        }
        List<Dept> dept_list = deptService.findAllDept();
        List<Job> job_list = jobService.findAllJob();
        model.addAttribute("job_list", job_list);
        model.addAttribute("dept_list",dept_list);
        return "/employee/add";
    }
    @PostMapping("/employee/add")
    public ModelAndView add(ModelAndView mv,@ModelAttribute Employee job ,Integer id){
        System.out.println(job);
        if(id!=null){
            employeeService.update_EmployeeInfo(job);
        }else{
            employeeService.insert_EmployeeInfo(job);
        }
        mv.setViewName("redirect:/employee/list");
        return mv;
    }
    @RequestMapping("/employee/delete")
    public void delete(Integer id){
        if(id!=null){
            jobService.delete_JobInfo(id);
        }
    }
}
