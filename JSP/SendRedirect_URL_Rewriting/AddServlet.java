package com.wepApp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Here as i'am extending this class with 'HttpServlet' now my class becomes Servlet class
public class AddServlet extends HttpServlet{
	
	//Here, we cannot use any another method name than 'service' 
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		
		/*now there are two ways in which you can send data to new page:
		1 Way] http://localhost:8080/DemoWebProject/minusNumbers?i=10&j=9 in the web-browser directly insert
			   parameter values after '?' as shown above
	    
	    2 Way] Or you can pass the variable in string format as shown below in 'sendRedirect' method
	    
	    3] As we are rewriting the URL hence it is called as URL Rewriting
	    
		*/
		response.sendRedirect("minusNumbers?i="+i+"&j="+j);
		
	}
	
}
