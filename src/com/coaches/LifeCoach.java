package com.coaches;

import com.fortuneservices.FortuneService;



public class LifeCoach implements Coach {

	private FortuneService fortuneService;
	
	// constructors
	public LifeCoach() {
		
	}
	
	public LifeCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "relax and make progress";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
