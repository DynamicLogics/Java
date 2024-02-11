package com.batch.configuration;

import org.springframework.batch.item.ItemProcessor;

import com.batch.bean.Person;

public class PersonItemProcessor implements ItemProcessor<Person, Person>{
	
	//public static int counter = 0;
	@Override
	public Person process(Person person) throws Exception {
		
		//System.out.println("------------INSIDE PROCESSOR--------------------------");
		final String firstName = person.getPersonName().toUpperCase();
	    final String lastName = person.getPersonSurname().toUpperCase();
	    final int getId = person.getPersonId();
	    final Person transformedPerson = new Person(getId, firstName, lastName);
	   // System.out.println(transformedPerson.getPersonId()+" -- "+transformedPerson.getPersonName()+
	   // 		" -- "+transformedPerson.getPersonSurname());
	    return transformedPerson; 
	    
	}

}
