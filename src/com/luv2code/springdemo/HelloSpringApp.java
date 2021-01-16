package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[]args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
	
		//retrieve the beans from container
		TrackCoach theCoach = context.getBean("myCoach",TrackCoach.class);
		
		//call method on beans
		System.out.print(theCoach.getDailyWorkout() + "   " + theCoach.getDailyFortune() );
		//	close the context
		context.close();
	}
}
