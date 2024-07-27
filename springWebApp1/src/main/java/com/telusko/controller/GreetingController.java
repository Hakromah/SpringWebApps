package com.telusko.controller;

import com.telusko.service.IGService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GreetingController {

    @Autowired
    private IGService service;

    @GetMapping("/home")
    public String getGreeting(HashMap<Object, String> map) {

        service.getGreeting(map);

        return "He was greeting you";
    }

}
