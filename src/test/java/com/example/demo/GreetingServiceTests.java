package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class GreetingServiceTests {

    @Test
    public void testComputeMoodNameGoodDay() {
        // given
        GreetingService greetingService = new GreetingService();
        int moodId = 1;

        // when
        String result = greetingService.computeMoodName(moodId);

        // then
        assertThat(result, is("Good Day!!"));
    }

    @Test
    public void testComputeMoodNameBadDay() {
        // given
        GreetingService greetingService = new GreetingService();
        int moodId = 2;

        // when
        String result = greetingService.computeMoodName(moodId);

        // then
        assertThat(result, is("Bad Day!!"));
    }

    @Test
    public void testComputeMoodNameAmazingDay() {
        // given
        GreetingService greetingService = new GreetingService();
        int moodId = 3;

        // when
        String result = greetingService.computeMoodName(moodId);

        // then
        assertThat(result, is("Amazing Day!!"));
    }

    @Test
    public void testComputeMoodNameOkDay() {
        // given
        GreetingService greetingService = new GreetingService();
        int moodId = 1234;

        // when
        String result = greetingService.computeMoodName(moodId);

        // then
        assertThat(result, is("Ok!!"));
    }


}
