package ssa.constructoInjection.SpringDependencyInjection;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) throws BeansException
    {
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext("applicationContext.xml");
        
        
        Coach coach = context.getBean("tennisCoach",Coach.class);
        
        System.out.println(coach.getWorkoutDetails());
        System.out.println(coach.getDailyFortuneDetails());
        
        context.close();
        
    }
}
