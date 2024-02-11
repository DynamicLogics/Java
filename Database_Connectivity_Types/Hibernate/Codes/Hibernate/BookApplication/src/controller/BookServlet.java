package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DoaClasses.BookDao;
import usedBeans.Book;


@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("bookname");	
		String author = request.getParameter("author");
		int price =Integer.parseInt(request.getParameter("price"));
		
		Book book = new Book(name,author,price);
		BookDao dao = new BookDao();
		dao.save(book);
		
	}
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
