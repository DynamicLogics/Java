package com.wepApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class UserFilter
 */
@WebFilter("/allowedUser")
public class UserFilter extends HttpFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("Inside Filter Page");
		
		//Here I'am filter the user name to printed only if user is above 18 years of age.
		int requiredAge = Integer.parseInt(request.getParameter("age"));
		if(requiredAge>=18) {
		chain.doFilter(request, response);
		}else {
			PrintWriter out = response.getWriter();
			out.print("User is underage");
		}
		
	}

}
