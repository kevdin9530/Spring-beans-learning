package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
		// get bean from spring container according the beans ID
		CricketCoach cc = ct.getBean("newCricketCoach", CricketCoach.class);
		// call method on the beans
		System.out.println(cc.getDailyWorkout());
		System.out.println(cc.getDailyFortune());

		// call method on literal injection
		System.out.println(cc.getEmailAdress());
		System.out.println(cc.getTeam());

		// another beans for testing value injection from a property file
		CricketCoach cc1 = ct.getBean("anotherCricketCoach", CricketCoach.class);
		// call method on the beans
		System.out.println(cc1.getDailyWorkout());
		System.out.println(cc1.getDailyFortune());

		// call method on literal injection
		System.out.println(cc1.getEmailAdress());
		System.out.println(cc1.getTeam());
		
		/*
		 * Below is for practicing by adding a small array for random fortune text everytime
		 */
		Coach ccpractice = ct.getBean("practiceCoach",Coach.class);
		System.out.println("Below is practice adding some random fortune text");
		System.out.println(ccpractice.getDailyFortune());
		// close context
		ct.close();
	}

}
