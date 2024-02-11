package com.OAuth2.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Repository;
import com.OAuth2.bean.UserPOJO;
//Part-4
/*
	Let’s create a class to read the user’s details such as password, username, etc from
	the database and send it to the UsersHelper class for authentication. This class we
	also called DAO or Repository class. We need to tag this class with @Repository annotation.
	
	In the below class, we have written a query to fetch the user detail. For
	GrantedAuthority we have set the value ROLE_SYSTEMADMIN. It means the role of
	the user is System Admin and this user we able to perform all tasks inside the application 
	which given to SYSTEM ADMIN.

 */
@Repository
public class UserDBQuery {

	@Autowired
	//@Lazy
	public JdbcTemplate jdbcTemplate;
	
	public UserPOJO getUserDetails(String userName) {
		
		System.out.println("UserDBQuery Class "+userName);
		
		Collection<GrantedAuthority> listOfGrantedAuthorities = new ArrayList<>();
		
		String userNamesQuery = "SELECT * FROM USERS WHERE USERNAME=?";
		
		@SuppressWarnings("deprecation")
		//here, I'am storing the DB Query result into the List
		/*
		 * Here, jdbcTemplate.query(String sql, @Nullable Object[] args, RowMapper<UserPOJO> rowMapper) 
		 * accepts 3 parameters that is 
		 * param-1: SQL query statement 
		 * param-2: Array of objects that needs to be passed as parameters in SQL statement  
		 * param-3: In the 3 parameter I'am mapping the result obtained by running the SQL query into
		 * 			my POJO/Bean class i.e. into the setters methods of that POJO/Bean class
		 * 
		 */
		List<UserPOJO> list = jdbcTemplate.query(
				
				userNamesQuery,//1 param 
				
				new String[]{userName},//2 param
				
				(ResultSet rs, int rowNumber)->{//3 param
					
		    	UserPOJO userPojo = new UserPOJO();
		    	
		    	userPojo.setUserName(rs.getString("USERNAME"));//userName
		    	//userPojo.setUserName("shubham");
		    	
		    	//here, PASSWORD is the column name present in USERS table
		    	userPojo.setPassword(rs.getString("PASSWORD"));
		    	//userPojo.setPassword("$2a$08$fL7u5xcvsZl78su29x1ti.dxI.9rYO8t0q5wk2ROJ.1cdR53bmaVG");
		    	
		    	System.out.println("step-3 UserPOJO");
		    	
		    	return userPojo;
			}
				
		);
		
		if(list.size()>0) {
			/*
			 * Here, GrantedAuthority I have set the value ROLE_SYSTEMADMIN. 
			 * It means the role of the user is System Admin and this user 
			 * we able to perform all tasks inside the application which 
			 * given to SYSTEM ADMIN
			 * 
			 */
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ROLE_SYSTEMADMIN");
			
			listOfGrantedAuthorities.add(grantedAuthority);
			
			list.get(0).setListOfGrantedAuthorities(listOfGrantedAuthorities);
			
			System.out.println("step-5 UserPOJO");
			
			return list.get(0);
			
		}
		
		return null; 
		
	}
	
}
