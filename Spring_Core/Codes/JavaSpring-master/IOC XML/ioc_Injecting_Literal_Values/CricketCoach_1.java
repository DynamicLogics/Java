package ioc_Injecting_Literal_Values;

import IoC.Coach;

public class CricketCoach_1 implements Coach_3 {

	private FortuneService_3 fortuneService;
	public String emailAddress;
	public String teamName;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside the emailAddress setter method");
		this.emailAddress = emailAddress;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		System.out.println("CricketCoach: Inside the teamName setter method");
		this.teamName = teamName;
	}

	//no argument constructor
	public CricketCoach_1() {
		System.out.println("CricketCoach: Inside the no-argument constructor");
	}
	
	public void setFortuneService(FortuneService_3 fortuneService) {
		System.out.println("CricketCoach: Inside the setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Daily pratice bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
