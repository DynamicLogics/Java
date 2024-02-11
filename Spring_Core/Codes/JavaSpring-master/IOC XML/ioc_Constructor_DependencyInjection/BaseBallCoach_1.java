package ioc_Constructor_DependencyInjection;

public class BaseBallCoach_1 implements Coach_1 {

private HappyFortuneService fortuneService;
	
	public BaseBallCoach_1(HappyFortuneService dependentService) {
		this.fortuneService = dependentService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Daily pratice 30 minutes in batting cage!!!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
