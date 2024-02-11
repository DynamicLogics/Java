package ssa.constructoInjection.SpringDependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	//here the coach is dependent on this fortune service to predict 
	//players daily fortune.
	DailyFortune fortune;
	
	@Autowired
	public TennisCoach(DailyFortune fortuneServ) {
		this.fortune = fortuneServ;
	}
	
	@Override
	public String getWorkoutDetails() {
		return "Daily run 4 km.";
	}
	
	@Override
	public String getDailyFortuneDetails() {
		return this.fortune.getDailyFortune();
	}
	
}
