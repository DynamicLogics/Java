package ssa.fieldInjection;

import org.springframework.stereotype.Component;

@Component
public class GoodFortune implements Fortune{

	@Override
	public String getFortune() {
		return "You have an Good Fortune today.";
	}
	
}
