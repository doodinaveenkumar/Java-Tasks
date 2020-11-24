package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/greetingMood")
   public Greetings Greetings(@RequestParam int mood) {  
    	
        	
    	return new Greetings(mood);
    }

	
}
