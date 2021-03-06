package com.coaches;

import com.fortuneservices.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	// constructor
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 20 laps";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
