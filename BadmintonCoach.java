package com.luv2code.springdemo;

public class BadmintonCoach implements Coach {
	// define private field for the dependency
	private FortuneService fortuneService;
	
	//private fields for literal values
	private String emailAdd;
	private String team;
	
	public String getEmailAdd() {
		return emailAdd;
	}

	public void setEmailAdd(String emailAdd) {
		System.out.println("Badminton Coach: inside Set Email Address Method");
		this.emailAdd = emailAdd;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Badminton Coach: inside Set Team Method");
		this.team = team;
	}

	//create no-arg constructor
	public BadmintonCoach() {
		System.out.println("Badminton Coach: inside no-arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Badminton Coach: inside setter method");
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Learn racket tricks everyday.";
		
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Good Going: "+fortuneService.getFortune();
	}

}
