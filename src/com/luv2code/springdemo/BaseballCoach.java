package com.luv2code.springdemo;


public class BaseballCoach implements Coach{
	//define private field for dependecy
	private FortuneService fortunesv;
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortunesv) {
		fortunesv = theFortunesv;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30mins hitting ball";
	}

	@Override
	public String getSportName() {
		
		return "Baseball";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortunesv.getFortune();
	}
}
