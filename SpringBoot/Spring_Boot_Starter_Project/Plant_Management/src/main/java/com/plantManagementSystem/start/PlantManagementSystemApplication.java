package com.plantManagementSystem.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

/*
* Author: Shubham.S.Ashtaputre
* License: Open Source Project
* Created Date: 16/08/2022
*/

//(scanBasePackages = {"com.plantManagementSystem.rest.*"})
@SpringBootApplication
//we need componentscan to call controll class RestController
@ComponentScan(basePackages = {"com.plantManagementSystem.rest.*","com.plantManagementSystem.rest.configurations"})
@EntityScan("com.plantManagementSystem.rest.bean")
@EnableJpaRepositories(basePackages="com.plantManagementSystem.rest.dao_")
//extends SpringBootServletInitializer
public class PlantManagementSystemApplication{
	
	public static void main(String[] args){
		
		SpringApplication.run(PlantManagementSystemApplication.class, args);
		
		/*
		 * If you want to get all the autoconfigured beans list
		 * 
		 * ApplicationContext is a corner stone of a Spring Boot application. It represents the Spring IoC container 
		 * and is responsible for instantiating, configuring, and assembling the beans. 
		 * The container gets its instructions on what objects to instantiate, configure, and assemble 
		 * by reading configuration metadata.
		 * 
		 */
		/*
		ConfigurableApplicationContext con = 
		SpringApplication.run(PlantManagementSystemApplication.class, args);
		
	    System.out.println("App Name---> "+con.getId());
		
		for (String string : con.getBeanDefinitionNames()) {
			System.out.println("Beans---> "+string);
		}
		*/
		//--- END OF MAIN METHOD
	}		

	   @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	
}
