package com.luv2code.springdemoannontations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		//read spring config
		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("beansAnnontationContext.xml");
		//get the bean from spring container
		TennisCoach c = ct.getBean("tennisCoach",TennisCoach.class);
		//call a method on the bean
		System.out.println(c.getDailyWorkout());
		//call method to get dailyFortune
		System.out.println(c.getDailyFortune());
		//call method get from property file
		System.out.println(c.getValueFromPropertyFile());
		//close context
		ct.close();
	}

}
