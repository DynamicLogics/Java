package ssa.constructoInjection.SpringDependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class DailyPlayerFortune implements DailyFortune{

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day.";
	}
	
}
