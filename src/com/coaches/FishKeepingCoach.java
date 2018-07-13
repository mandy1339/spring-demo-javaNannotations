package com.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fortuneservices.FortuneService;

@Component
@Scope("prototype")
public class FishKeepingCoach implements Coach {
	
//	@Autowired								// FIELD INJECTION
//    @Qualifier("randomFortuneService")
	private FortuneService fortuneService;		

	@Autowired
	public FishKeepingCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "feed the fishies 5 pellets";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


}
