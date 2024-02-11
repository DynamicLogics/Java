package dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Badfortune implements DailyFortune{

	@Override
	public String getTodaysFortune() {
		return "Today you have bad LUCK";
	}

}
