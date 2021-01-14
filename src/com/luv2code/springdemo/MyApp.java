package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String [] args ) {
		//create object
		Coach bbc = new TrackCoach();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//use the object
		System.out.print(bbc.getDailyWorkout());
	}
}
