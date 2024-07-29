package com.telusko.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {

    @GetMapping("/courseInfo")
    public String getCourse(Model model){

        return "course";
    }
}
