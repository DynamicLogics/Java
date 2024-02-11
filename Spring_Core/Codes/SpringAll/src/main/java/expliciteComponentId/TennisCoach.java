package expliciteComponentId;

import org.springframework.stereotype.Component;

@Component("thisCoach")
public class TennisCoach implements Coach{

	@Override
	public String getDailyPraticeDetails() {
		return "Daily Pratice Tennis for 4 hours.";
	}
	
}
