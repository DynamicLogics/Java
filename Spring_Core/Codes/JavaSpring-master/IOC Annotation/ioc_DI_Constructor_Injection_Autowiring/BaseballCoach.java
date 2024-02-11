package ioc_DI_Constructor_Injection_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach_2 {

	private Fortune fortuneService;//interface class name
	
	@Autowired //this "@Autowired" is going to scan for class that implements fortune interface
	public BaseballCoach(Fortune fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily pratice base-ball for 2 hours";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
