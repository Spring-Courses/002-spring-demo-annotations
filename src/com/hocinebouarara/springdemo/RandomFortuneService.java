package com.hocinebouarara.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array strings
	private String[] data = { "string nbr 1", "string nbr 2", "string nbr 3" };

	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from array
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
