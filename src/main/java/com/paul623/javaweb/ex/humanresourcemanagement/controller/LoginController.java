package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/")
    public String getLogin(){
        return "loginForm";
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
