package dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{

	//Field Injection
	/*@Autowired
	DailyFortune fortune;*/
	
	DailyFortune fortune;
	
	@Override
	public String getDailyCoachingRoutine() {
		return "Daily pratice swimming or 2 hours.";
	}
	
	//Setter Injection
	@Autowired
	@Qualifier("badfortune")
	public void setDailyCoachingFortune(DailyFortune fortune) {
		this.fortune = fortune;
	}
	
	@Override
	public String getDailyCoachingFortune() {
		return fortune.getTodaysFortune();
	}
	
}
