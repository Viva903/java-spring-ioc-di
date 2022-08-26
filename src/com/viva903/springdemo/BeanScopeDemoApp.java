package com.viva903.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
//		load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

//		retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		Coach alphaCoach = context.getBean("trackCoach", Coach.class);
		
		Coach theBaseballCoach = context.getBean("baseballCoach", Coach.class);
		Coach theBetaBaseballCoach = context.getBean("baseballCoach", Coach.class);
		
//		check if they are the same bean -> coming from singleton
		boolean result = (theCoach == alphaCoach);
		System.out.println("\nPointing to the same object : " + result);
		System.out.println("\nMemory Location for theCoach : " + theCoach);
		System.out.println("\nMemory Location for theCoach : " + alphaCoach + "\n");
		
		result = (theBaseballCoach == theBetaBaseballCoach);
		System.out.println("\nPointing to the same object : " + result);
		System.out.println("\nMemory Location for theCoach : " + theBaseballCoach);
		System.out.println("\nMemory Location for theCoach : " + theBetaBaseballCoach + "\n");
		
//		call methods on the bean
		
		
//		close the context 
		context.close();

	}

}
