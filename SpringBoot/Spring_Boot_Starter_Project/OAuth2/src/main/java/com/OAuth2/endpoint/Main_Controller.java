package com.OAuth2.endpoint;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Part-8
/* 
   In this class we will create a API or HTTP Endpoints as a Resources, so that once
   the client pass throgh authentication then they will able to access the API.
*/
@CrossOrigin
@RestController
@RequestMapping("/enter")
public class Main_Controller {

	@GetMapping(path="/home",
		    	produces=MediaType.APPLICATION_JSON_VALUE)
	public String index() {
		System.out.println("step-1 Main_Controller");
		return "Inside Spring Boot Controller Page";
	}
	
}
