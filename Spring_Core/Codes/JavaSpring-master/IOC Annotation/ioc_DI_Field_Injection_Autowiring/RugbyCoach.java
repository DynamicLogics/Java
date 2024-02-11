package ioc_DI_Field_Injection_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RugbyCoach implements Coach_4 {

	@Autowired //it can be used on both public and private fields
	@Qualifier("newFortuneService")
	private Fortune_2 fortuneService;//interface class name

	public RugbyCoach() {
		System.out.println("Inside rugby Default constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Daily pratice Rugby for 2 hours";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortune();
	}

}
