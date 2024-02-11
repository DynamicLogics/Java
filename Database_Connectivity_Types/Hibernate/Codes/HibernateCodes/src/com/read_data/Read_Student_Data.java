package com.read_data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read_Student_Data {

	public static void main(String[] args) {
		
		SessionFactory  sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")	
										.addAnnotatedClass(Student3.class)
										.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			//below is the code to insert the data that to the database
			
			//create a student object
			System.out.println("creating new student object...");
			Student3 student = new Student3("John","Doe","john@gmail.com");
			
			//start the transaction
			session.beginTransaction();
			
			//save the transaction object
			System.out.println("saving the student...");
			System.out.println(student);
			session.save(student);
			//session.save(student2);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("data saved in database successfully...");	
		
			//below is the code to retrieve the data that we saved from the database
			
			//find the student's id i.e primary key
			System.out.println("Student saved. Generated id: "+student.getId());
			
			//now get an new session and start transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			//retrieve student based on id i.e primary key
			System.out.println("Getting student with id: "+student.getId());
			
			Student3 retrieveStudent  = session.get(Student3.class, student.getId());
			
			System.out.println("Get complete "+ retrieveStudent);
			
			//commit transaction
			session.getTransaction().commit();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			sessionFactory.close();
		}
		
	}
}
