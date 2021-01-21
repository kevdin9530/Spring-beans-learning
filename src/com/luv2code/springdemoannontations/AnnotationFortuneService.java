package com.luv2code.springdemoannontations;

import org.springframework.stereotype.Component;

@Component
public class AnnotationFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "You are maybe lucky with the Annotation";
	}

}
