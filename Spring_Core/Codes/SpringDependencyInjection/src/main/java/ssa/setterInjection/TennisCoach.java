package ssa.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	Fortune fotune;
	
	public TennisCoach() {
		System.out.println("Inside Constructor");
	}
	
	@Autowired
	//if two or more service implements the same interface then we get ambiguity of dependency injection
	//hence we need to use Qualifier to tell which DI we want to use
	@Qualifier("badFortune")
	public void setDailyFortune(Fortune forServ) {
		this.fotune = forServ;
	}
	
	@Override
	public String getDailyWorkoutRotuine() {
		return "Run 6km daily.";
	}

	@Override
	public String getDailyFortune() {
		return this.fotune.getFortune();
	}

}
