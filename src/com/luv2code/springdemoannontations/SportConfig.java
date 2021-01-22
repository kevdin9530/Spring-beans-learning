package com.luv2code.springdemoannontations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
@ComponentScan("com.luv2code.springdemoannontations")
public class SportConfig {
	
	@Bean
	public Coach swimCoach() {
		SwimCoach sc = new SwimCoach(someFortuneService());
		return sc;
	}
	
	@Bean
	public FortuneService someFortuneService() {
		return new SomeFortuneServices();
	}
}
