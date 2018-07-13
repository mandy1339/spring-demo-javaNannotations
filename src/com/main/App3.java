package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.coaches.Coach;

public class App3 {

	public static void main(String[] args) {
		
		// create context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(NoScanPracticeJavaConfig.class);
		
		// load bean
		Coach coach1 = context.getBean("lifeCoach", Coach.class);
		
		// use bean
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getDailyFortune());
		
		// close context
		context.close();

	}

}
