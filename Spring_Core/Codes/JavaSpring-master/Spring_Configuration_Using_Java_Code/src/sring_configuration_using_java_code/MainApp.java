package sring_configuration_using_java_code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		//Make use of spring java config file instead of xml file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigFile.class);
		
		// get the bean from spring container
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		//get the bean methods
		System.out.println(coach.getDailyWorkoutRotuine());
		System.out.println(coach.getDailyFortune());

		//close the context
		context.close();
		
	}

}
