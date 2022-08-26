package com.viva903.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
//		load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//		retrieve bean from spring container
		SoccerCoach soccerCoach = context.getBean("soccerCoach", SoccerCoach.class);
		
//		call methods on the bean
		System.out.println(soccerCoach.getDailyWorkout());
		System.out.println(soccerCoach.getDailyFortune());
		System.out.println(soccerCoach.getTeam());
		System.out.println(soccerCoach.getEmailAddress());
		
//		close the context 
		context.close();
	}

}
