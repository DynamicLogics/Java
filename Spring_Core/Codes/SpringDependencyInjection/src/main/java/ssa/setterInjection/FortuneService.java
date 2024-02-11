package ssa.setterInjection;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements Fortune{

	@Override
	public String getFortune() {
		return "Today is your lucky day.";
	}
	
}
