package com.luv2code.springdemoannontations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeApp {
	public static void main(String[]args) {
		//load config file
		ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("beansAnnontationContext.xml");
		//retrieve a bean
		Coach c = ct.getBean("tennisCoach",Coach.class);
		Coach c2 = ct.getBean("tennisCoach",Coach.class);
		//check if they have the same result due to being singelton
		System.out.println("Are they the same? "+ (c.equals(c2)));
		System.out.println("check memory of 1  "+c);
		System.out.println("check memory of 2  "+c2);
		//check practice postConstruct and read file for daily fortune text
		System.out.println(c.getDailyFortune());
		System.out.println(c2.getDailyFortune());
		//close context
		ct.close();
	}
}
