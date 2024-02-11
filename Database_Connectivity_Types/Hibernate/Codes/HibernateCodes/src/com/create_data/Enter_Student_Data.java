package com.create_data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Enter_Student_Data {

	public static void main(String[] args) {
		
		SessionFactory  sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")	
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			//create a student object
			System.out.println("creating new student object...");
			Student student1 = new Student("Shubham1","Ashtaputre1","abc1@gmail.com");
			
			//start the transaction
			session.beginTransaction();
			
			//save the transaction object
			System.out.println("saving the student...");
			session.save(student1);
			//session.save(student2);
			
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
