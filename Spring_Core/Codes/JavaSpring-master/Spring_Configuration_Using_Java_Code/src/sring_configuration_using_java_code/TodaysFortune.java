package sring_configuration_using_java_code;

import org.springframework.stereotype.Component;

@Component
public class TodaysFortune implements Fortune {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}
	
}
