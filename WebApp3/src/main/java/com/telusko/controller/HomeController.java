package com.telusko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/c1")
public class HomeController {

    @GetMapping("/info1")
    public String getHomeInfo(Model model) {

        model.addAttribute("names", "This is the third Web app");
        return "home";
    }

    @GetMapping("/info2")
    public String getInfo(Model model) {

        model.addAttribute("telk", "This is Telusko Page");
        return "telusko";
    }

    @GetMapping("/info3")
    public String getMapInfo(Map<String, Object> map) {
        map.put("focus", "Focust is the key for any skill");
        return "focus";
    }
}
