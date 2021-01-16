package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {
	private String[]a = {"a bad day","a good day","a normal day"};
	@Override
	public String getFortune() {
		return "Today is "+ a[(int) (System.currentTimeMillis() % a.length)];
	}

}
