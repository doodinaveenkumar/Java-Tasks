package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greetingMood")
    public Greeting Greetings(@RequestParam int mood) {
        Greeting greeting = new Greeting();
        greeting.setName(greetingService.computeMoodName(mood));
    	return greeting;
    }
}
