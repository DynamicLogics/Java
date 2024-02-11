package com.update_data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update_Student_Data {

	public static void main(String[] args) {
		
		SessionFactory  sessionFactory = new Configuration()
										.configure("hibernate.cfg.xml")	
										.addAnnotatedClass(Student4.class)
										.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			int studentId = 1;

			//start the transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();		
			
			//find out students id i.e primarykey
			System.out.println("Saved student generated id: "+studentId);
			
			Student4 student = session.get(Student4.class, studentId);
 			
			System.out.println("\nUpdating student...");
			
			//change the first of primary key 1
			student.setFirstName("Tommy1");
			
			//commit transaction
			session.getTransaction().commit();
			
			//Now updating all email for all student at a one time
			//start the transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			//update email for all students
			System.out.println("updating emails for all students...");
			
			session.createQuery("update Student4 set email='foo@gmail.com'").executeUpdate();
			
			//commit transaction
			session.getTransaction().commit();

			System.out.println("\nUpdate completed successfully...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			sessionFactory.close();
		}
		
	}
}
