package ssa.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//reading context file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("setterInjectionApplicationContext.xml");
		
		//reading the bean file
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		//reading the required methods
		System.out.println(coach.getDailyWorkoutRotuine());
		System.out.println(coach.getDailyFortune());
		
		//closing the context file
		context.close();
	}

}
