package com.spring.coach;

public class BaseballCoach implements Coach {
	
	FortuneService fService = null;
	
	public BaseballCoach(FortuneService fService) {
		this.fService = fService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		
		return "Spend 30 mins in batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fService.getDailyFortunes();
	}
	
	
}
