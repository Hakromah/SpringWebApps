package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {

    @RequestMapping("/info")
    public ModelAndView getAllCourses() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "We have started Spring Web");
        mv.setViewName("index");
        return mv;
    }
}
