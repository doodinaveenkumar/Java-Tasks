package com.example.restapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetingMood")
   public Greeting Greetings(@RequestParam int mood) {  
    	
        	
    	return new Greeting(mood);
    }

	
}
