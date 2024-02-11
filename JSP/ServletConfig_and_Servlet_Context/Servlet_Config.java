package com.wepApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
		 
public class Servlet_Config extends HttpServlet{
		 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 
		/*
		 * getServletConfig() method is part of GenericServlet method, which is extended by 
		 * HttpServlet abstract class
		 * 
		 */
		ServletConfig config = getServletConfig(); 
		 
		String val = config.getInitParameter("name");
		System.out.println(val);
		 
		PrintWriter print = response.getWriter();
		print.print(val);// out(context);
		 
	}
	
}
