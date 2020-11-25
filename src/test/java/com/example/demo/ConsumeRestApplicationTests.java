package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class ConsumeRestApplicationTests {

	@Autowired
	private MockMvc mvc;

	@Autowired
	ObjectMapper objectMapper;


	@Test
	void contextLoads() {
	}

	@Test
	public void testGreetingsMoodApi() throws Exception {
		// given
		String url = "/greetingMood";
		String mood = "1";

		// when
		ResultActions ra = mvc.perform(
				get(url)
						.param("mood", mood)
						.contentType(MediaType.APPLICATION_JSON)
		);
		String result = ra.andReturn().getResponse().getContentAsString();
		Greeting data = objectMapper.readValue(result, Greeting.class);

		// then
		assertThat(data.getName(), is("Good Day!!"));
	}

	@Test
	public void testGreetingsMoodApiReturnsOk() throws Exception {
		// given
		String url = "/greetingMood";
		String mood = "1";

		// when
		ResultActions ra = mvc.perform(
				get(url)
						.param("mood", mood)
						.contentType(MediaType.APPLICATION_JSON)
		);

		// then
		ra.andExpect(status().isOk());
	}

}
