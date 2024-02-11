package ssa.setterInjection;

import org.springframework.stereotype.Component;

@Component
public class BadFortune implements Fortune{

	@Override
	public String getFortune() {
		return "Bad Luck Today";
	}

}
