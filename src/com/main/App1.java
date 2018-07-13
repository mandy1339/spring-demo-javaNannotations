package com.main;

import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coaches.Coach;

public class App1 {

	public static void main(String[] args) {
		

		// load spring config files
		AnnotationConfigApplicationContext contextScan = new AnnotationConfigApplicationContext(ScanJavaConfig.class);
//		AnnotationConfigApplicationContext contextNoScan = new AnnotationConfigApplicationContext(NoScanJavaConfig.class);
		
		// retrieve bean from spring container
//		Coach coach1 = contextScan.getBean("fishKeepingCoach", Coach.class);
//		Coach coach2 = contextNoScan.getBean("fishKeepingCoach", Coach.class);
		
		// call methods on the beans
//		System.out.println(coach1.getDailyWorkout());
//		System.out.println(coach1.getDailyFortune());
//		System.out.println("COACH1 NUM OF ");
//		boolean isSameObj = (coach1 == coach2);
//		System.out.println("SAME OBJECT ?: " + isSameObj);
//		System.out.println(coach2.getDailyFortune());
		
		// close the context
//		contextScan.close();
//		contextNoScan.close();
	}

}
