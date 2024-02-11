package ssa.constructorInjection.SpringBeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	//reading the context xml file
    	ClassPathXmlApplicationContext context = 
    			new ClassPathXmlApplicationContext("applicationContext.xml");
    
    	//reading the bean
    	Coach coach = context.getBean("cyclingCoach",Coach.class);
    	
    	
    	Coach coach2 = context.getBean("cyclingCoach",Coach.class);
    	
    	//checking if both the objects are true or not
    	String val = coach==coach2?"True":"False";
    	System.out.println(val);
    	
    	System.out.println(coach.getCoachingDetails());
    	System.out.println(coach.getDailyFortuneDetails());
    	//System.out.println();
    
    	//closing the context file reading
    	context.close();
    	
    	
    }
}
