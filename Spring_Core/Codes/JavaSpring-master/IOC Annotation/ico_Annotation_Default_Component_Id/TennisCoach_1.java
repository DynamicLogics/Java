package ico_Annotation_Default_Component_Id;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach_1 implements Coach_1 {

	@Override
	public String dailyWorkout() {
		return "Daily pratice tennis for 3 hours";
	}

}
