package com.luv2code.springdemoannontations;

import org.springframework.stereotype.Component;

@Component
public class TestCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "I'm here today to do some test to test your test and the test will show your ability to test your test";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
