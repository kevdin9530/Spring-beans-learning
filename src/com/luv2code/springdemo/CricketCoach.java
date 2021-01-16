package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fs;
	private String emailAdress;
	private String team;
	
	

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("CricketCoach: inside setter method setEmail");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method setTeam");
		this.team = team;
	}

	//setter method
	public void setFortuneService(FortuneService fs) {
		System.out.println("CricketCoach: inside setter method setFs");
		this.fs = fs;
	}
	
	public CricketCoach() {
		System.out.println("CricketCoach:no arg-constructor");
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		
		return "Pratice bowling 15mins everyday";
	}

	@Override
	public String getSportName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}
