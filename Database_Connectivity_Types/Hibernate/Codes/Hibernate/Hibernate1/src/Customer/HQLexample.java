package Customer;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLexample 
{

	public static void main(String[] args)
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();  //3.3 step		
		Session session  = sessionfactory.openSession();//step 3.3		
		session.beginTransaction();
		
		Query query = session.createQuery("from Customers");
		//Query query = session.createQuery("from Customers where customerid=2");
		List list =  query.list();
		
		Iterator i =  list.iterator();//iterator to printing the objects/values inside the table one by one
		
		while(i.hasNext())
		{
			Customers c = (Customers)i.next();//Customers is class name not a variable
			System.out.println("Customer id:"+c.getCustomerid());
			System.out.println("Customer name:"+c.getCustomername());
			System.out.println("Customer id:"+c.getAddress());
			System.out.println("Customer id:"+c.getPhonenumber());
		}
		
	}

}
