package com.create_data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//In the below code we are inserting multiple values to our mysql database

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		SessionFactory  sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")	
				.addAnnotatedClass(Student2.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
		
		//create a student object
		System.out.println("creating new student object...");
		Student2 student1 = new Student2("Shubham1","Ashtaputre1","abc1@gmail.com");
		Student2 student2 = new Student2("sim","world","sim@gmail.com");
		Student2 student3 = new Student2("jim","country","jim@gmail.com");
		
		//start the transaction
		session.beginTransaction();
		
		//save the transaction object
		System.out.println("saving the student...");
		session.save(student1);
		session.save(student2);
		session.save(student3);
		
		//commit transaction
		session.getTransaction().commit();
		
		System.out.println("data saved in database successfully...");	
		
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		finally {
		sessionFactory.close();
		}	
		
	}

}
