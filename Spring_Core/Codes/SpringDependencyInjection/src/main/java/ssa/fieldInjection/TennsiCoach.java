package ssa.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennsiCoach implements Coach {
	
	@Autowired
	Fortune fortune;
	
	@Override
	public String workoutRoutine() {
		return "Daily pratice for 2 hrs.";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

	
	
}
