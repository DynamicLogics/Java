package Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class objectsave
{
	public static void name()
	{
		Customers customer = new Customers(1,"Priya","Pune",80808080);//3.2 step
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();  //3.3 step
	
		Session session  = sessionfactory.openSession();//step 3.3
		
		session.beginTransaction();
		
		session.save(customer);//step 3.4
		
		session.getTransaction().commit();
		
		session.close();
		
	}

}
