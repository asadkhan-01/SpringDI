package com.spring.coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springHelloApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach coach = context.getBean("myCricketCoach", Coach.class);
		//call methods
		System.out.println(coach.getDailyWorkout()+" and \n"+ coach.getDailyFortune());
		// close context
		context.close();
		
	}

}
