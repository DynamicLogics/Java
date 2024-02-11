package com.wepApp;

import java.io.IOException;
import java.net.HttpCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Here I'am using annotation instead of web.xml file to redirect particular url to required servlet
@WebServlet("/addNumbers")
public class AddServlet extends HttpServlet{
	
	//Here, we cannot use any another method name than 'service', 'doGet', 'doPost'
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		Cookie cookie1 = new Cookie("i", i+""); // integer + string = string instead of String.valueOf() method
		Cookie cookie2 = new Cookie("j", j+""); // integer + string = string
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		
		response.sendRedirect("minusNumbers");
		
	}
	
}
