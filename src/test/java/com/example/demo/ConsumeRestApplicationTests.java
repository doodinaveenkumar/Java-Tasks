package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class ConsumeRestApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public  void Restservice() {
		
			RestTemplate resttemplate = new RestTemplate();
			Greeting greeting = resttemplate.getForObject("http://localhost:8080//greetingMood?mood=1", Greeting.class);
			System.out.println(greeting.getName());
}
}
