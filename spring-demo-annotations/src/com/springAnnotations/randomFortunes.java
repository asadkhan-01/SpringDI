package com.springAnnotations;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class randomFortunes implements FortuneService {

	private String[] fortunes = new String[4]; 
	
	@Value("${fortune1}")
	String fortune1;
	
	@Value("${fortune2}")
	String fortune2;
	
	@Value("${fortune3}")
	String fortune3;
	
	@Value("${fortune4}")
	String fortune4;
	
	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		fortunes[0] = fortune1;
		fortunes[1] = fortune2;
		fortunes[2] = fortune3;
		fortunes[3] = fortune4;
		
		
		Random random = new Random();
		
		
		return fortunes[random.nextInt(4)];
	}

}
