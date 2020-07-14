package com.paul623.javaweb.ex.humanresourcemanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SumController {

    @RequestMapping("/sum/charts")
    public String getSumCharts(){
        return "/summary/sumCharts";
    }
}
