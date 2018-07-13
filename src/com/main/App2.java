package com.main;

import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coaches.Coach;

public class App2 {

	public static void main(String[] args) {
				
		//////////////////////////////////////////////////////////
		//// SHOWCASING NOSCAN CONFIG
		
		// load spring config files
		AnnotationConfigApplicationContext contextNoScan = new AnnotationConfigApplicationContext(NoScanJavaConfig.class);
		
		// retrieve bean from spring container
		Coach coach2 = contextNoScan.getBean("fishKeepingCoach", Coach.class);
		
		// use methods on the bean
		System.out.println("coach2");
		System.out.println("daily workout: " + coach2.getDailyWorkout());
		System.out.println("daily fortune: " + coach2.getDailyFortune());
		
		// close the context
		contextNoScan.close();
		
		//// SHOWCASING NOSCAN CONFIG
		//////////////////////////////////////////////////////////

	}

}
