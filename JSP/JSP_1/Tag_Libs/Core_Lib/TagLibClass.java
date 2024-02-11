package com.wepApp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tagLibClass")
public class TagLibClass extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = "Shubham";
		
		request.setAttribute("label", name);
		
		RequestDispatcher disaptcher = request.getRequestDispatcher("TagLibDemo.jsp");
		disaptcher.forward(request, response);
		
	}

}
