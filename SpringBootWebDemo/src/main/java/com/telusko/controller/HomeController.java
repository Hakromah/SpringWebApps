package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody // will make it return the data not the file name
    public String greeting(){

        return "Welcome to our first Spring Web App";
    }

    @GetMapping("/about")
    @ResponseBody
    public String about(){
        return "Get lost totally";
    }
}
