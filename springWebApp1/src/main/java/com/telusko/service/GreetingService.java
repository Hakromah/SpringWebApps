package com.telusko.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GreetingService implements IGService{

    @Override
    public Map<Object, String> getGreeting(HashMap<Object, String> map) {



        return map;
    }
}
