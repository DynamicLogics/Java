package com.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.create_data.Student2;

public class HQLQueries {

	private static void displayStudent(List<Student3> theStudent) {
		for (Student3 tempStudent  : theStudent) {
			System.out.println(tempStudent);
		}
	}
	
	public static void main(String[] args) {
		
		SessionFactory  sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")	
				.addAnnotatedClass(Student3.class)
				.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {

			//Note: for hibernate 5.2 above version instead of 'list()' use 'getResultList()'
					
			//start the transaction
			session.beginTransaction();

			//HQL query to display all students 
			List<Student3> theStudent = session.createQuery("from Student3").list();			
			//Display the student
			displayStudent(theStudent);
			
			//HQL query to display student whose last name id 'Doe'
			//here 'lastName' is property name from Student3 class and not column name from mysql table
			theStudent = session.createQuery("from Student3 s where s.lastName='Doe'").list();
			//Display the student
			System.out.println("\n\nStudent whose last name is joe...");
			displayStudent(theStudent);
			
			
			//HQL query student whose last name is 'Doe' or firstname is 'sim'
			//'OR' clause
			theStudent = session.createQuery("from Student3 s where s.lastName='Doe' OR s.firstName='sim'").list();
			//Display the student
			System.out.println("\n\nStudent whose last name is doe or first name is sim...");
			displayStudent(theStudent);
			
			
			//'LIKE' clause
			//HQL query students where email address like 'gmail.com'
			theStudent = session.createQuery("from Student3 s where s.email LIKE '%gmail.com'").list();
			//Display the student
			System.out.println("\n\nStudent whose email address like 'gmail.com'...");
			displayStudent(theStudent);
			
			
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
