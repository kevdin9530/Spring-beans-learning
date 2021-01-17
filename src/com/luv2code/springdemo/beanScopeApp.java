package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeApp {

	public static void main(String[] args) {
		// Load spring config file
		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("bean-lifecycle-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = ct.getBean("myScopeCoach", Coach.class);
		

	
		System.out.println(theCoach.getDailyWorkout());
		
		ct.close();
	}

}
