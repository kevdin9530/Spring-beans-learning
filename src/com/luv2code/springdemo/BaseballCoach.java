package com.luv2code.springdemo;


public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Spend 30mins hitting ball";
	}

	@Override
	public String getSportName() {
		
		return "Baseball";
	}
}
