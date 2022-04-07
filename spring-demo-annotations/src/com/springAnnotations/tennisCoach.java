package com.springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class tennisCoach implements Coach {

	FortuneService service = null;
	
	
	/* Uncomment if you want to use constructor injection
	public tennisCoach(FortuneService service) {
		this.service = service;
	}
	*/


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice back hand volley";
	}
	
	@Override
	public String getDailyFortunes() {
		
		return service.getDailyFortunes();
	}
	
	@Autowired
	@Qualifier("randomFortunes")
	public void setFortuneService(FortuneService service) {
		this.service = service;
	}

}
