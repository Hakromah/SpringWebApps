package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {

    @RequestMapping("/info1")
    public ModelAndView getInformation() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "We have started Spring Web");
        mv.setViewName("index");
        return mv;
    }

    //@RequestMapping(value = "/cInfo", method = RequestMethod.POST)
    @RequestMapping("/info2")
    public ModelAndView getAllCourses() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Course Start At 6:30 am TR and Ends at 9:00 am");
        mv.setViewName("index");
        return mv;
    }
}
