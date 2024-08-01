package com.telusko.webapp4.controller;

import com.telusko.webapp4.service.IGreetingService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
public class GController {

    @Autowired
    private IGreetingService service;

    //    @GetMapping("/greet1")
//    public String getMeWishes(Map<String, Object> map) {
//        map.put("wishes", "Happy Birthday");
//        return "g1";
//    }

//    @PostMapping("/greet1")
//    public String getMeWishPost(Map<String, Object> map) {
//        map.put("g1", service.getGreeting("Matthew"));
//        return "ctxpath";
//    }

    @GetMapping("/greet1")
    public String getMeWishes(Map<String, Object> map) {
        map.put("gct1", service.getGreeting("Mohammed"));
        return "ctxpath";
    }

    @GetMapping("/greet2")
    public void getGreeting(Map<String, Object> map) {
        //String msg = service.getGreeting("Fatime");
        map.put("g2", service.getGreeting("Fatime"));
    }

    @GetMapping("/greet3")
    public Map<String, Object> getWishes() {

        Map<String, Object> map = new HashMap<>();
        map.put("g3", "Happy Birthday");
        return map;
    }

    @GetMapping("/greet4")
    public void sayHello(HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<h1>Hello from GController" + service.getGreeting("Aishan") + "</h1>");

    }
}
