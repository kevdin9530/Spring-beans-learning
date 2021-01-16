package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean from spring container according the beans ID
		CricketCoach cc = ct.getBean("myCoach",CricketCoach.class);
		//call method on the beans
		System.out.println(cc.getDailyWorkout());
		System.out.println(cc.getDailyFortune());
		//close context
		ct.close();
	}

}
