package sring_configuration_using_java_code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private Fortune fortune;
	
	@Autowired
	public TennisCoach(Fortune fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyWorkoutRotuine() {
		return "Pratice Tennis for 1 hour daily...";
	}

	@Override
	public String getDailyFortune() {
		return this.fortune.getFortune();
	}

}
