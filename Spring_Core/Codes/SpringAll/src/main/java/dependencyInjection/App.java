package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("dependencyInjection.xml");
		
		Coach coach = context.getBean("swimmingCoach",Coach.class);
		
		System.out.println(coach.getDailyCoachingRoutine());
		System.out.println(coach.getDailyCoachingFortune());
		
		context.close();
		
	}

}
