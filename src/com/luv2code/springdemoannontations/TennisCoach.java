package com.luv2code.springdemoannontations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//inside "" is the bean id
//if u dont write bean-id, the default bean-id will be class name with first letter lower case

public class TennisCoach implements Coach {

	private FortuneService fs;
	
	@Autowired
	public TennisCoach(FortuneService fs) {
		this.fs = fs;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pratice hitting the ball 30 ytimes";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fs.getFortune();
	}

}
