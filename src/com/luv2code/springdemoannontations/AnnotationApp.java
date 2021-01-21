package com.luv2code.springdemoannontations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		//read spring config
		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("beansAnnontationContext.xml");
		//get the bean from spring container
		Coach c = ct.getBean("tennisCoach",Coach.class);
		//call a method on the bean
		System.out.println(c.getDailyWorkout());
		//call method to get dailyFortune
		System.out.println(c.getDailyFortune());
		//close context
		ct.close();
	}

}
