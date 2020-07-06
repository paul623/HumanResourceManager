package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import com.paul623.javaweb.ex.humanresourcemanagement.entity.Dept;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.Employee;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.Job;
import com.paul623.javaweb.ex.humanresourcemanagement.entity.SumData;
import com.paul623.javaweb.ex.humanresourcemanagement.service.DeptService;
import com.paul623.javaweb.ex.humanresourcemanagement.service.EmployeeService;
import com.paul623.javaweb.ex.humanresourcemanagement.service.JobService;
import com.paul623.javaweb.ex.humanresourcemanagement.service.SumDataService;
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
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    JobService jobService;
    @Autowired
    DeptService deptService;
    @Autowired
    SumDataService sumDataService;

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
    public String add(Model model,String id){
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
    @GetMapping("/employee/rePassword")
    public String getRePassword(){
        return "/employee/rePassword";
    }
    @PostMapping("/employee/rePassword")
    public ModelAndView updatePassWord(ModelAndView mv,HttpSession session,String old_pass,String password,String c_password){
        Employee user=(Employee) session.getAttribute(Constants.USER_SESSION);
        System.out.println(user);
        if(user.getPassword().equals(old_pass)){
            if(password.equals(c_password)){
                user.setPassword(password);
                employeeService.update_EmployeeInfo(user);
                session.setAttribute("msg",null);
                session.setAttribute("msg_s","修改成功！");
            }else {
                session.setAttribute("msg","两次密码不一致");
            }
        }else {
            session.setAttribute("msg","密码不正确");
        }
        mv.setViewName("redirect:/employee/rePassword");
        return mv;
    }

    @GetMapping("/employee/updateInfo")
    public String getUpdateInfo(Model model,HttpSession session){
        Employee user=(Employee) session.getAttribute(Constants.USER_SESSION);
        model.addAttribute("data",user);
        return "/employee/updateInfo";
    }
    @PostMapping("/employee/updateInfo")
    public ModelAndView updateInfo(ModelAndView mv,@ModelAttribute Employee employee,HttpSession session){
        System.out.println("系统拦截："+employee);
        Employee user=(Employee) session.getAttribute(Constants.USER_SESSION);
        employee.setId(user.getId());
        employeeService.update_EmployeeInfo(employee);
        session.setAttribute("msg","修改成功！");
        employee=employeeService.get_EmployeeInfo(employee.getId()+"");
        session.setAttribute(Constants.USER_SESSION,employee);//更新一下
        mv.setViewName("redirect:/employee/updateInfo");
        return mv;
    }
    @RequestMapping("/employee/getMoreInfo")
    public String  getMoreInfo(HttpSession session,String id){
        Employee employee=employeeService.get_EmployeeInfo(id);
        session.setAttribute("deptName",sumDataService.getDeptName(employee.getDeptId()));
        session.setAttribute("jobName",sumDataService.getJobName(employee.getJobId()));
        session.setAttribute("employee",employee);
        System.out.println("？？？跳转了啊");
        return "/employee/getInfo";
    }
}
