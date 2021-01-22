package com.luv2code.springdemoannontations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigApp {
	public static void main(String[]args) {
		//load config file
		AnnotationConfigApplicationContext ct = new AnnotationConfigApplicationContext(SportConfig.class);
		//retrieve a bean
		Coach c = ct.getBean("swimCoach",Coach.class);
		Coach c2 = ct.getBean("swimCoach",Coach.class);
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
