package com.wepApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		
		//if you want to send the attribute values from one dispatcher to another
		request.setAttribute("i", i);
		request.setAttribute("j", j);
		
		//now calling minus servlet
		RequestDispatcher rd = request.getRequestDispatcher("minusNumbers"); 
		//this below request and response get forwarded to MinusServlet 'service' methods parameters
		rd.forward(request, response);
		
	}
	
}
