package com.viva903.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	private String[] fortuneMessage = { 
			"Today is your Lucky Day !!", 
			"Tomorrow is your Sad Day !!",
			"The day after tomorrow will be your Best Day !!"
	};

	private Random random = new Random();


	@Override
	public String getFortune() {
		int randomInt = random.nextInt(fortuneMessage.length);
		return fortuneMessage[randomInt];
	}

}
