package com.telusko.webapp4.controller;

import com.telusko.webapp4.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class GController {

    @Autowired
    private IGreetingService service;

    @GetMapping("/greet1")
    public String getMeWishes(Map<String, Object> map) {
        map.put("wishes", "Happy Birthday");
        return "g1";
    }

    @GetMapping("/greet1")
    public void getGreeting(Map<String, Object> map) {
        //String msg = service.getGreeting("Fatime");
        map.put("g2", service.getGreeting("Fatime"));
    }

    @GetMapping("/greet2")
    public Map<String, Object> getWishes() {

        Map<String, Object> map = new HashMap<>();
        map.put("g3", "Happy Birthday");
        return map;
    }
}
