package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 30 mins and pass some balls";
	}

	@Override
	public String getSportName() {
		// TODO Auto-generated method stub
		return "Football";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
