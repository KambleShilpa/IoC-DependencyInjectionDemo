package com.luv2code.springdemo;

public class MyApp {
	//1.an application to get daily workouts from various coaches
	//2. app should be configurable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getting workout from single coach
		//create the object
		BaseballCoach theCoach = new BaseballCoach();
		//use the object
		System.out.println(theCoach.getDailyWorkout());
		
		//1. getting workout by creating an interface-- refactoring according to best software engineering practice
		//Coach coach = new BaseballCoach();
		//System.out.println(coach.getDailyWorkout());
		
		//1. getting workout from track coach -- we just need to change the right side of = 
		Coach coach = new TrackCoach();
		System.out.println(coach.getDailyWorkout());
		
		// we have achieved the first part of problem. However we haven't achieved the second part as the new Baseballcoach
		// or new trackcoach is still hardcoded. We need to make the app configurable that means it should read the config
		//file and identify new instance
		
		//HelloSpringApp.java fulfills the second requirement
	}

}
