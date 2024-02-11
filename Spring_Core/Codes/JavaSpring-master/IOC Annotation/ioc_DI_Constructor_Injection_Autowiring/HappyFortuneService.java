package ioc_DI_Constructor_Injection_Autowiring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements Fortune {

	@Override
	public String getFortune() {
		return "Today is you lucky day";
	}

}
