package ioc_DI_Field_Injection_Autowiring;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService_2 implements Fortune_2 {

	@Override
	public String getFortune() {
		return "Today is you lucky day";
	}

}
