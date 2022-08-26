package com.viva903.springdemo;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
//	add new fields
	private String emailAddress;
	private String team;
	
//	create a no-arg constructor
	public SoccerCoach() {
		System.out.println("This is a SoccerCoach no-arg Constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Tactical Training for 2 horus !";
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("This is a SoccerCoach Setter Method");
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	
}
