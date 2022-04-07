package com.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	
	}

}
