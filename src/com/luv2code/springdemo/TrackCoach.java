package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	//define dependecy
	private FortuneService fortuneService;
	
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
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
		return "Just DO IT "+ fortuneService.getFortune();
	}

	//add an init method
	public void init() {
		System.out.println("inside init method");
	}
	//add an destroy method
	public void destroy() {
		System.out.println("inside destroy method");
	}
}
