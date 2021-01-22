package com.luv2code.springdemoannontations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyPracticeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load config class
		AnnotationConfigApplicationContext ct = new AnnotationConfigApplicationContext(MyPracticeConfig.class);
		//retreive the bean
		Coach c = ct.getBean("myPracticeCoach",Coach.class);
		//use the method
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		//close context
		ct.close();
	}

}
