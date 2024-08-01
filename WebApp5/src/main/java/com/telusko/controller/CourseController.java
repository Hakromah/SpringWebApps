package com.telusko.controller;

import com.telusko.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class CourseController {

    @GetMapping("/course1")
    public String getCourseInfo(Model model) {

        Course course = new Course(1, "React.js", 100, 499.9);
        model.addAttribute("course1", course);
        return "course";
    }

    @GetMapping("/course2")
    public String getCourseInfo(Map<String, Object> map) {

        Course c2 = new Course(2, "Spring Boot", 55, 399.9);
        map.put("cs2", c2);
        return "course2";
    }
}
