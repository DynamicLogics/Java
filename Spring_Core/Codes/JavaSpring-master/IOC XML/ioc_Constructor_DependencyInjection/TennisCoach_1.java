package ioc_Constructor_DependencyInjection;

public class TennisCoach_1 implements Coach_1 {

	private HappyFortuneService fortuneService;
	
	public TennisCoach_1(HappyFortuneService dependentService) {
		this.fortuneService = dependentService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Daily run a hard 5km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
