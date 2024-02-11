package sring_bean_using_Java_Code;

public class SwimCoach implements Coach {
	
	FortuneService service;
	
	public SwimCoach(FortuneService service) {
		this.service = service;
	}
	
	@Override
	public String getDailyWorkout() {
		return "pratice 400m swim daily...";
	}

	@Override
	public String getDailyFortune() {
		return this.service.getTodaysFortune();
	}

}
