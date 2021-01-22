package com.luv2code.springdemoannontations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyPracticeConfig {
	@Bean
	public FortuneService myPracticeFortuneService() {
		return new MyPracticeFortuneService();
	}
	
	@Bean
	public Coach myPracticeCoach() {
		return new MyPracticeCoach(myPracticeFortuneService());
	}
}
