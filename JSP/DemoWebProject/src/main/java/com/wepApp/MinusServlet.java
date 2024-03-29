package com.wepApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//Here I'am using annotation instead of web.xml file to redirect particular url to required servlet
@WebServlet("/minusNumbers")
public class MinusServlet extends HttpServlet{
	
	public static int val1;
	public static int val2;
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException{

		Cookie cookies[] = request.getCookies();
		
		for(Cookie val:cookies) {
			//System.out.println(val.getName());
			if(val.getName().equals("i")) {
				val1 = Integer.parseInt(val.getValue());
				//System.out.println(val1);
			}else if(val.getName().equals("j")) {
				val2 = Integer.parseInt(val.getValue());
				//System.out.println(val2);
			}
		}
		
		int k = val1-val2;
		
		//to print result on webpage
		PrintWriter out = response.getWriter();
		out.write("Results: "+ k);
		
	}
	
}
