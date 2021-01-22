package com.luv2code.springdemoannontations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private ArrayList<String> a = new ArrayList<>();
			
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return a.get(new Random().nextInt(a.size()));
	}
	
	@PostConstruct
	public void init() {
		File file = new File("src/fortunetext.txt");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
				a.add(sc.nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
