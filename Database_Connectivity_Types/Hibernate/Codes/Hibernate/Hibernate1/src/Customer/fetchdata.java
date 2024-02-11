package Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchdata 
{
	
	public static void main(String[] args) 
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();  //3.3 step
		
		Session session  = sessionfactory.openSession();//step 3.3
		
		session.beginTransaction();
		
		Customers c = (Customers) session.get("Customer.Customers", 2);
		
		System.out.println("Id:"+c.getCustomerid());
		System.out.println("Name:"+c.getCustomername());
		System.out.println("Address:"+c.getAddress());
		System.out.println("PhoneNumber:"+c.getPhonenumber());
		
		session.getTransaction().commit();
		
		session.close();

	}

}
