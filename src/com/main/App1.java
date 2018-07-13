// NOTE: IF YOU UNCOMMENT THIS CONFIG CLASS, YOU HAVE TO COMMENT THE NOSCANCONFIG CLASS. 
// IT'S EITHER ONE OR THE OTHER

//package com.main;
//
//
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//
//import com.coaches.Coach;
//
//public class App1 {
//
//	public static void main(String[] args) {
//		
//		
//		//////////////////////////////////////////////////////////
//		//// SHOWCASING SCAN CONFIG
//		// load spring config file
//		AnnotationConfigApplicationContext contextScan = new AnnotationConfigApplicationContext(ScanJavaConfig.class);
//		
//		// retrieve bean from spring container
//		Coach coach1 = contextScan.getBean("fishKeepingCoach", Coach.class);
//		
//		// call methods on the beans
//		System.out.println("coach1");
//		System.out.println("daily workout: " + coach1.getDailyWorkout());
//		System.out.println("daily fortune: " + coach1.getDailyFortune());
//		
//		// close the context
//		contextScan.close();
//
//		//// SHOWCASING SCAN CONFIG		
//		//////////////////////////////////////////////////////////
//
//		
//
//	}
//
//}
