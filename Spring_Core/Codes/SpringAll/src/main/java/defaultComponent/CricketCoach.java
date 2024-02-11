package defaultComponent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach{

	@PostConstruct
	public void start() {
		System.out.println("method initialised after contructor loaded");
	}
	
	@Override
	public String getDailyRoutines() {
		return "Daily pratice cricket for 3 hours.";
	}
	
	@PreDestroy
	public void end() {
		System.out.println("method innitialised before bean/class ends");
	}

	
}
