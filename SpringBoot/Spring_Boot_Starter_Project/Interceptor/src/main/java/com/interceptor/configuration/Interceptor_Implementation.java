package com.interceptor.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/* 
 * public class Interceptor_Implementation extends abstract class HandlerInterceptorAdapter is 
 * depreceted as by extending the HandlerInterceptorAdapter we need to implement all 3
 * interceptors method  
 * 
 * now, by implementing the interface 'HandlerInterceptor' we can only use the required 
 * methods of interceptor in our code
 * 
 */
@Component
public class Interceptor_Implementation implements HandlerInterceptor {
	/*
	 * now, before making controller access to the user
	 * you can do the validation/authorization/authentication part here in
	 * Interceptor and then lets the REST API request proceed further to the controller
	 * 
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
    throws Exception {
		System.out.println("\n");
		System.out.println("Inside preHandle Interceptor method");
		System.out.println("Request Type: "+request.getMethod());
		System.out.println("Parameter 1: "+request.getParameter("id"));
		System.out.println("Parameter 2: "+request.getParameter("name"));
		System.out.println("Find the request is HTTP or HTTPS: "+request.getScheme());
		System.out.println("Server Name: "+request.getServerName());
		System.out.println("\n");
		return true;
	}
	
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
						   @Nullable ModelAndView modelAndView) throws Exception {
		System.out.println("Inside postHandle Interceptor method");
		System.out.println("HTTP Response Status: "+response.getStatus());
		System.out.println("Response Class: "+response.getClass());
		System.out.println("\n");
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
								@Nullable Exception ex) throws Exception {
		System.out.println("Inside afterCompletion Interceptor method");
		System.out.println("\n");
	}
	
}
