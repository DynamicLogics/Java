package dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class SportsFortune implements DailyFortune{

	@Override
	public String getTodaysFortune() {
		return "Today is your LUCKY day.";
	}
	
}
