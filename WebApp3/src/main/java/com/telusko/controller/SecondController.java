package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/c2")//root url very important
public class SecondController {

    @GetMapping("/info1")
    public String getSecondMsg(Model model) {
        model.addAttribute("focus", "Second Controller Details");
        return "focus";
    }
}
