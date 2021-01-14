package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	//define dependecy
	private FortuneService fs;
	
	public TrackCoach(FortuneService fs) {
		super();
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run boi run";
	}

	@Override
	public String getSportName() {
		// TODO Auto-generated method stub
		return "I'm running track ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just DO IT "+ fs.getFortune();
	}

}
