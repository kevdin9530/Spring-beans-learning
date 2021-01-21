package com.luv2code.springdemoannontations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//inside "" is the bean id
//if u dont write bean-id, the default bean-id will be class name with first letter lower case

public class TennisCoach implements Coach {
	
	
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fs;
	
/*	@Autowired
	public TennisCoach(FortuneService fs) {
		this.fs = fs;
	}

	//define setter method
	@Autowired
	public void setFs(FortuneService fs) {
		System.out.println("inside setter method");
		this.fs = fs;
	}
	*/

	public TennisCoach() {
	super();
	System.out.println("inside default constructor");
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
	
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public String getValueFromPropertyFile() {
		return ("the email is:" + email + " \n the team is:"+ team);
	}
/*	@Autowired
	public void justDoSomething(FortuneService fs) {
		System.out.println("inside a random method method");
		this.fs = fs;
	}
*/
}
