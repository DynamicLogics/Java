package ssa.constructorInjection.SpringBeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")//prototype
public class CyclingCoach implements Coach {

	FortuneService getDailyFortune;
	
	public CyclingCoach() {
		System.out.println("Constructor initialized.");
	}
	
	//initalizing bean lifecycle
	@PostConstruct
	public void getBeanInitValue() {
		System.out.println("Method invoked after contructor and DI loaded");
	}
	
	//destroying bean lifecycle
	@PreDestroy
	public void closeBeanInitValue() {
		System.out.println("Method invoked before of bean destruction");
	}
	
	@Override
	public String getCoachingDetails() {
		return "Pratice cycling for 4 km daily.";
	}
	
	//using setter injection
	//here '@Autowired' will scan which class implemented 'FortuneService' interface and return that value here
	@Autowired
	public void setDailyFortuneDetails(FortuneService getTodaysFortune) {
		getDailyFortune = getTodaysFortune;
	}
	
	//returning the value
	@Override
	public String getDailyFortuneDetails() {
		return getDailyFortune.getFortune();
	}
	

}
