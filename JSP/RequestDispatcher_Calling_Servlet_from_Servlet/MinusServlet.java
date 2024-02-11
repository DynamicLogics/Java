package com.wepApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MinusServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		int val1 = (int) request.getAttribute("i");
		int val2 = (int) request.getAttribute("j");
		int result = val1-val2;
		
		PrintWriter out = response.getWriter();
		//to print result on webpage
		out.write("Result: "+ result);
		
	}
	
}
