package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext contexts  = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		BadmintonCoach badminton = contexts.getBean("myBadmintonCoach",BadmintonCoach.class);
				
		//call methods from the bean
		//lets comeback and do this later
		System.out.println(badminton.getDailyWorkout());
		System.out.println(badminton.getDailyFortune());
		
		//calling our new n=methods to get literal values
		System.out.println(badminton.getEmailAdd());
		System.out.println(badminton.getTeam());
		
		//close the context
		contexts.close();

	}

}
