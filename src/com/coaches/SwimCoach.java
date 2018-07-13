package com.coaches;

import com.fortuneservices.FortuneService;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Swim 20 laps";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
