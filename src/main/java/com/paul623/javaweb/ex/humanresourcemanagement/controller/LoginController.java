package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @RequestMapping("/home")
    public String getLogin(HttpServletRequest request){
        request.setAttribute("message", "");
        return "home/home";
    }
    @RequestMapping("/")
    public String getHomePage(HttpServletRequest request){
        request.setAttribute("message", "");
        return "home/home";
    }

    @RequestMapping("/{formName}")
    public String loginForm(@PathVariable String formName){
        return formName;
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

}
