package com.spring.coach;

import java.util.Random;

public class RandomFortunes implements FortuneService {

	String[] randomFortunes = {"Good Luck!!", "Wohooo!! Go get them", "Work Hard and you shall get it!!"};
	
	
	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		Random random = new Random();
		return randomFortunes[random.nextInt(3)];
	}

}
