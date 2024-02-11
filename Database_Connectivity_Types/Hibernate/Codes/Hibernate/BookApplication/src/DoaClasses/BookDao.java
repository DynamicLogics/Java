package DoaClasses;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import usedBeans.Book;

public class BookDao
{
	public static List fetch()
	{
		List booklist = null;//obj of list initialisation of list
		
		try
		{
			SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();  //3.3 step		
			Session session  = sessionfactory.openSession();//step 3.3		
			session.beginTransaction();
			
			Query query = session.createQuery("from bookapp");//book is a table name or a specified table name '@'
			//Query query = session.createQuery("from Customers where customerid=2");
			booklist =  query.list();
			
			session.close();
			session.getSessionFactory().close();//close it else database will collapse
			
		}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
		
		return booklist ;
		
	}
	
	
	public int save(Book book)
	{
	try
	{
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();	
		return 1;
	}
	catch(Exception e)
	{
		System.out.println("error"+e);
	}
	return 0;
	}
	

}












