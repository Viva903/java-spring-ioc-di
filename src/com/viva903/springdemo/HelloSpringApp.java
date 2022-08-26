package com.viva903.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//Retrieve bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
//call methods on the bean
		System.out.println(trackCoach.getDailyWorkout());
		System.out.println(baseballCoach.getDailyWorkout());
		System.out.println(soccerCoach.getDailyWorkout());
		
//call methods for fortune
		System.out.println(baseballCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyFortune());
		
//close the context
		context.close();
	}

}
