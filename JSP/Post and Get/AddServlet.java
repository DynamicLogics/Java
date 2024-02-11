package com.wepApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Here as i'am extending this class with 'HttpServlet' now my class becomes Servlet class
public class AddServlet extends HttpServlet{
	
	//Here, we cannot use any another method name than 'service' 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		int k = i+j;
		//System.out.println("Addition: "+k);
		PrintWriter out = response.getWriter();
		//to print result on webpage
		out.write("Result: "+k);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			int i = Integer.parseInt(request.getParameter("num1"));
			int j = Integer.parseInt(request.getParameter("num2"));
			int k = i+j;
			//System.out.println("Addition: "+k);
			PrintWriter out = response.getWriter();
			//to print result on webpage
			out.write("Result: "+k);
	}
	
	
}
