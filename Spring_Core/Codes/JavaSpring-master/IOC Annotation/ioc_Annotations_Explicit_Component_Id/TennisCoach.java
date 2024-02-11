package ioc_Annotations_Explicit_Component_Id;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	@Override
	public String dailyWorkout() {
		return "Daily pratice tennis for 2 hours";
	}

}
