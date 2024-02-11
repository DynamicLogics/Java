package ioc_Setter_DependencyInjection;

import IoC.Coach;

public class CricketCoach implements Coach_2 {

	private FortuneService_2 fortuneService;
	
	//no argument constructor
	public CricketCoach() {
		System.out.println("CricketCoach: Inside the no-argument constructor");
	}
	
	public void setFortuneService(FortuneService_2 fortuneService) {
		System.out.println("CricketCoach: Inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily pratice bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
