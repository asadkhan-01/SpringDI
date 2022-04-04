package com.spring.coach;

public class eSportsCoach implements Coach{
	
	FortuneService fService;
	
	public eSportsCoach(FortuneService fService) {
		this.fService = fService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice TDM in BGMI daily";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fService.getDailyFortunes();
	}
	
	

}
