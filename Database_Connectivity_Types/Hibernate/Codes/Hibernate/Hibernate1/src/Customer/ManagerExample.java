package Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManagerExample
{

	public static void main(String[] args)
	{
		
		Address address = new Address("India","Adgaon","Maharashtra","rd-1","1234");	
		Person p = new Person("Hari","1",address); 

		/*System.out.println("Name:"+p.getName());
		System.out.println("ID:"+p.getId());
		System.out.println("Country:"+p.getAddress().getCountry());
		System.out.println("State:"+p.getAddress().getState());
		System.out.println("Road:"+p.getAddress().getRoad());
		System.out.println("Pin:"+p.getAddress().getPin());*/
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();  //3.3 step
		Session session  = sessionfactory.openSession();//step 3.3
		session.beginTransaction();
		session.save(address);
		session.save(p);
		session.getTransaction().commit();
		session.close();

		
		
	}

}
