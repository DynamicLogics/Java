package com.OAuth2.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/*
 * OAuth2Application
 * UserPOJO
 * UserHelper
 * UserDBQuery
 * UserService
 * SecurityConfiguration
 * ConfigOAuth2
 * Main_Controller
 */

//Part-1
/*
   
   @EnableAuthorizationServer: This annotation enables the Authorization Server in
							   the application.
   
   @EnableResourceServer: 	   It makes the application Resource Server. 
   
   Here, our application will act as both Authorization as well as Resource Server
   
*/
@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@ComponentScan(basePackages = {"com.OAuth2.*","com.OAuth2.endpoint"})
public class OAuth2Application {
	public static void main(String[] args) {
		SpringApplication.run(OAuth2Application.class, args);
	}

}
