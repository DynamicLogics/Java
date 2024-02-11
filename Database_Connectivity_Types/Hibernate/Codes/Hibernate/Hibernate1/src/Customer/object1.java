package Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class object1 
{

	public static void main(String[] args)
	{
		//Customers customer1=  new Customers(1,"Priya","Pune",80808080);//3.2 step
		Customers customer2 = new Customers(2,"Prakash","Nagpur",80808080);
		Customers customer3 = new Customers(3,"Pankaj","Punjab",80808080);
		Customers customer4 = new Customers(4,"Pooja","Delhi",80808080);
		
		
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();  //3.3 step
	
		Session session  = sessionfactory.openSession();//step 3.3
		
		session.beginTransaction();
		
		//session.save(customer);//step 3.4
		session.save(customer2);		
		session.save(customer3);
		session.save(customer4);
		
		
		session.getTransaction().commit();
		
		session.close();

	}

}
