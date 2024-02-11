package com.wepApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Context extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		/*
		 * getServletContext() method is part of  method, which is extended by 
		 * HttpServlet abstract class
		 * 
		 */
		
		ServletContext context = getServletContext();
		
		String val = context.getInitParameter("name");
		System.out.println(val);
		
		String val2 = context.getInitParameter("nationality");
		System.out.println(val2);
		
		PrintWriter print = response.getWriter();
		print.print(val+"\n"+val2);// out(context);
	}
	
}
