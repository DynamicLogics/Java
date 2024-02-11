package ioc_DI_Field_Injection_Autowiring;

import org.springframework.stereotype.Component;

@Component
public class NewFortuneService implements Fortune_2 {

	@Override
	public String getFortune() {
		return "Today is you lucky day";
	}

}
