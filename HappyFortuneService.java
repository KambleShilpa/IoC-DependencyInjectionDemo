package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	/*
	 * @Override public String getFortune() { return "Today is your lucky day!!"; }
	 */
	
	//for activity
	//create array of strings
	String data[] = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//create a random number generator
	private Random random = new Random();
	
	
	@Override
	public String getFortune() {
		//pick random string from array
		int index = random.nextInt(data.length);
		String todaysFortune = data[index];
		return todaysFortune;
	}


}
