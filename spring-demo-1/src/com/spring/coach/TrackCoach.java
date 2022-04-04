package com.spring.coach;

public class TrackCoach implements Coach {
	FortuneService fService = null;
	public TrackCoach(FortuneService fService) {
		
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fService.getDailyFortunes();
	}

}
