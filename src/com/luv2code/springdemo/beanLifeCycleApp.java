package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleApp {

	public static void main(String[] args) {
		// Load spring config file
		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = ct.getBean("myScopeCoach", Coach.class);
		Coach aCoach = ct.getBean("myScopeCoach", Coach.class);

		// check if the are the same
		System.out.println("Pointing to the same object " + (theCoach == aCoach));
		System.out.println("Memory location of the theCoach " + theCoach);
		System.out.println("Memory location of the aCoach " + aCoach);
		ct.close();
	}

}
