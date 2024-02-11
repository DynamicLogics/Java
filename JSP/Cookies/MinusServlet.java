package com.wepApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MinusServlet extends HttpServlet{
	
	public static int val1;
	public static int val2;
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		//here the client will give all the available cookies and we have to decide which 
		//cookie we have to take/use
		Cookie cookies[] = request.getCookies();
		
		for(Cookie val:cookies) {
			System.out.println(val.getName());
			if(val.getName().equals("i")) {
				val1 = Integer.parseInt(val.getValue());
				System.out.println(val1);
			}else if(val.getName().equals("j")) {
				val2 = Integer.parseInt(val.getValue());
				System.out.println(val2);
			}
		}
		
		int k = val1-val2;
		
		//to print result on webpage
		PrintWriter out = response.getWriter();
		out.write("Result: "+ k);
		
	}
	
}
