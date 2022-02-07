package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define private field for the dependency
	private FortuneService fortuneService;
	
	public BaseballCoach() {
		//for errors in myapp for creating objects without parameters
	}
	
	//define a constructor for the dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in catching practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneService to get my fortune
		//So the coach can do daily workouts on his own. But for fortunes, he actually needs a helper.
		//We're gonna use that dependency that was passed in.
		//So you all say fortuneService.getFortune and that's what I return.
		//So I'm basically helping out the coach by making use of this little helper class or like an assistant to help the coach out.
		return fortuneService.getFortune();
	}
}
