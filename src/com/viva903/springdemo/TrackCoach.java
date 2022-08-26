package com.viva903.springdemo;

public class TrackCoach implements Coach {

//	define a private filed for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyFortune() {
		return "Track Coach : " + fortuneService.getFortune();
	}
	
	@Override
	public String getDailyWorkout() {

		return "Run a hard 10k";
	}
}
