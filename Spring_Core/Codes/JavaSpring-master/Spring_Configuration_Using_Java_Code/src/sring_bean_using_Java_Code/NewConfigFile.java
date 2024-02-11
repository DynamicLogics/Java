package sring_bean_using_Java_Code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NewConfigFile {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();	
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
