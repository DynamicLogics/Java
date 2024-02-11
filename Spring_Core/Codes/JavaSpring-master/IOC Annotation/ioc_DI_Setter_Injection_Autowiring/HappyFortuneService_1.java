package ioc_DI_Setter_Injection_Autowiring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService_1 implements Fortune_1 {

	@Override
	public String getFortune() {
		return "Today is you lucky day";
	}

}
