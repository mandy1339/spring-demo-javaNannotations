package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coaches.Coach;
import com.coaches.LifeCoach;
import com.fortuneservices.FortuneService;
import com.fortuneservices.WeirdFortuneService;

@Configuration
public class NoScanPracticeJavaConfig {
	
	@Bean
	public Coach lifeCoach() {
		LifeCoach theCoach = new LifeCoach(weirdFortuneService());
		return theCoach;
	}
	
	@Bean
	public FortuneService weirdFortuneService() {
		return new WeirdFortuneService();
	}
}
