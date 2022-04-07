package com.springAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//read config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container 
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		//call a bean method
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortunes());
		
		context.close();
	}

}
