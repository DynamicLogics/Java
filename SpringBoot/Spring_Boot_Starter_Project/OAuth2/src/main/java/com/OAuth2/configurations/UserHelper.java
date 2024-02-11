package com.OAuth2.configurations;

import org.springframework.security.core.userdetails.User;

import com.OAuth2.bean.UserPOJO;
//Part-3
/*	
  	We need to create one more class that extends the User class provided by spring
	security and it is present in org.springframework.security.core.userdetails.User.
	The purpose of creating a UsersHelper class is to authenticate the user.
 */	
public class UserHelper extends User{

	public static final long serialVersionUID = 1L;
	
	public UserHelper(UserPOJO user) {
		
		super(
				user.getUserName(),
				user.getPassword(),
				user.getListOfGrantedAuthorities()
			 );
		
		System.out.println("step-4 UserHelper "+user.getUserName()+" "+user.getPassword()+" "+ 
							user.getListOfGrantedAuthorities());
		
	}
	
}
