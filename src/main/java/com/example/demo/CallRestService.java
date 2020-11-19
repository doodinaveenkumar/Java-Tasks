package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CallRestService implements CommandLineRunner {
	
	public static void CallRestService() {
		RestTemplate resttemplate = new RestTemplate();
		Greeting greeting = resttemplate.getForObject("http://localhost:8080//greetingMood?mood=1", Greeting.class);
		System.out.println(greeting.getName());
	}

	@Override
	public void run(String... args) throws Exception {
		CallRestService();
		
	}

}
