package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String computeMoodName(int moodId) {
        switch (moodId) {
            case 1:
                return "Good Day!!";
            case 2:
                return "Bad Day!!";
            case 3:
                return "Amazing Day!!";
            default:
                return "Ok!!";
        }
    }
}
