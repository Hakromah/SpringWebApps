package com.telusko.webapp4.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetingService implements IGreetingService{

    @Override
    public String getGreeting(String name) {

        LocalDateTime hr = LocalDateTime.now();
        int hh = hr.getHour();

        if(hh < 12){
            return "Good Morning " + name;
        }else if(hh < 16){
            return "Good Afternoon " + name;
        }else if(hh < 20){
            return "Good Evening " + name;
        }else{
            return "Good Night " + name;
        }
    }
}
