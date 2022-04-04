package com.spring.coach;

public class cricketCoach implements Coach {

	FortuneService fService = null;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Catches Daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fService.getDailyFortunes();
	}
	
	public void setFortuneService(FortuneService fService) {
		this.fService = fService;
	}

}
