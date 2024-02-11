package com.OAuth2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.OAuth2.bean.UserPOJO;
import com.OAuth2.configurations.UserHelper;
import com.OAuth2.dao.UserDBQuery;
//Part-5
/*
	We can also create UsersDetailService that extends the
	org.springframework.security.core.userdetails.UserDetailsService .The purpose of
	this class to call or invoke the DAO class or Repository class as shown below.
*/
@Service
public class UserService implements UserDetailsService{

	@Autowired
	//@Lazy
	UserDBQuery query;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserPOJO userPojo = null;
		
		System.out.println("step-2 UserService");
		
		try {
			
				System.out.println("UserService Class "+username);
				
				//Here, I am calling getUserDetails to get userdetails 
				userPojo =  query.getUserDetails(username); 
				
				System.out.println(userPojo.getUserName()+" "+userPojo.getPassword()+" "+userPojo.getListOfGrantedAuthorities()); 
				
				//Here I'am passing user fetched data object into the UserHelper method 
				UserHelper userDetails = new UserHelper(userPojo); 
				
				return userDetails;
			
		}catch (Exception ex) {
			
				ex.printStackTrace();
				
				throw new UsernameNotFoundException("User "+ username +" was not found in the database");
				
		}
		
	}

}
