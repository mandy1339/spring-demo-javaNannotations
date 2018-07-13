package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.coaches.Coach;
import com.coaches.FishKeepingCoach;
import com.fortuneservices.FortuneService;
import com.fortuneservices.RandomFortuneService;
import com.fortuneservices.SadFortuneService;

@Configuration
@PropertySource("classpath:./com/fortuneservices/fortune.properties")
public class NoScanJavaConfig {
	
//	@Bean
//	public FortuneService randomFortuneService() {
//		return new RandomFortuneService();
//	}
//	
//	@Bean
//	public Coach fishKeepingCoach(FortuneService fortuneService) {
//		FishKeepingCoach myCoach = new FishKeepingCoach(randomFortuneService());
//		return myCoach;
//	}
//	
//	
//	

}
