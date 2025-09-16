package com.ironhack.hellospring.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class GreetService {


    public String greet() {

        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        if (hour < 12) {
            return "Good morning";
        } else {
            return "Good evening";
        }
    }
}
