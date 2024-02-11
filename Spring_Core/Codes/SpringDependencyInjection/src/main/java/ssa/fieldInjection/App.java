package ssa.fieldInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("fieldInjectionApplicationContext.xml");
		
		Coach coach = context.getBean("tennsiCoach",Coach.class);
		
		System.out.println(coach.workoutRoutine());
		System.out.println(coach.getDailyFortune());
		
		context.close();
		
	}

}
