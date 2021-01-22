package com.luv2code.springdemoannontations;

public class MyPracticeCoach implements Coach {

	private FortuneService fs;
	
	
	public MyPracticeCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "coach to practice IoC and DI";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}
