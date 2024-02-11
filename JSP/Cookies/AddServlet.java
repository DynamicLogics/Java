package com.wepApp;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Here as i'am extending this class with 'HttpServlet' now my class becomes Servlet class
public class AddServlet extends HttpServlet{
	
	//Here, we cannot use any another method name than 'service', 'doGet', 'doPost'
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		/*
		 * definition of cookie: A cookie is a piece of data from a website that is stored within a web browser that the 
		 * website can retrieve at a later time.
		 * Cookies are used to tell the server that users have returned to a particular website.
		 */
		
		Cookie cookie1 = new Cookie("i", i+""); // integer + string = string instead of String.valueOf() method
		Cookie cookie2 = new Cookie("j", j+""); // integer + string = string
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		response.sendRedirect("minusNumbers");
		
	}
	
}
