package com.OAuth2.bean;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
//Part-2
/*
    Here we will create a class or POJO class to store the users or client information in
    the database.
   
	Collection<GrantedAuthority>: It represents the collection or list of Granted Authority.
	GrantedAuthority: It is an interface in Spring Security which used to provides permission 
	to perform some tasks to the user, for example, add the new user or delete the existing user, etc. 
	I will explain with the code below it will be very easy to understand.
   
*/
public class UserPOJO {
	
	public String userName;
	public String password;
/*
 * 
 * GrantedAuthority: It is an interface in Spring Security which used to provides permission
 * 					 to perform some tasks to the user, for example, add the new user or
 * 					 delete the existing user 
 * 
 */
	public Collection<GrantedAuthority> listOfGrantedAuthorities = new ArrayList<>();
	
	public UserPOJO() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Collection<GrantedAuthority> getListOfGrantedAuthorities() {
		return listOfGrantedAuthorities;
	}

	public void setListOfGrantedAuthorities(Collection<GrantedAuthority> listOfGrantedAuthorities) {
		this.listOfGrantedAuthorities = listOfGrantedAuthorities;
	}
	
}
