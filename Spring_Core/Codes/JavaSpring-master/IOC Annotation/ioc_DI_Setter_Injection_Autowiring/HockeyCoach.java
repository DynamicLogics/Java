package ioc_DI_Setter_Injection_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach_3 {

	private Fortune_1 fortuneService;//interface class name
	
//	@Autowired //this "@Autowired" is going to scan for class that implements fortune interface
//	public HockeyCoach(Fortune_1 fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public HockeyCoach() {
		System.out.println("Inside Default constructor");
	}
	
	@Autowired //this "@Autowired" is going to scan for class that implements fortune interface
	public void setFortuneService(Fortune_1 fortuneService) {
		System.out.println("Inside setter method");
		this.fortuneService = fortuneService;
	}

	//instead of setter methos method for injection we can use ay methods just use
	//@Autowired on that method
	
	@Override
	public String getDailyWorkout() {
		return "Daily pratice Hockey for 2 hours";
	}

	@Override
	public String getFortuneService() {
		return this.fortuneService.getFortune();
	}

}
