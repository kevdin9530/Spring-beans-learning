package com.luv2code.springdemoannontations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] a= {
			"Lucky or not, here i come",
			"Not lucky enough i say",
			"You should use money to buy happiness"
	};
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return a[new Random().nextInt(a.length)];
	}

}
