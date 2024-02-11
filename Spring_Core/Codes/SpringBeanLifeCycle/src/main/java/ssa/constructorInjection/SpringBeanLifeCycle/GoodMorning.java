package ssa.constructorInjection.SpringBeanLifeCycle;

import org.springframework.stereotype.Component;

@Component
public class GoodMorning implements FortuneService{

	@Override
	public String getFortune() {
		return "You have a good day today.";
	}

}
