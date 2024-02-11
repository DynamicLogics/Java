package sring_bean_using_Java_Code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(NewConfigFile.class);
		
		Coach coach = context.getBean("swimCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
		
	}

}
