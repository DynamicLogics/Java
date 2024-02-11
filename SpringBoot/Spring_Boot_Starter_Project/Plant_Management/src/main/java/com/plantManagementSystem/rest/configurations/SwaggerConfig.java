package com.plantManagementSystem.rest.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
* Author: Shubham.S.Ashtaputre
* License: Open Source Project
* Created Date: 18/08/2022
*/


@Configuration
//to enable swagger use below annotation
@EnableSwagger2
public class SwaggerConfig {
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
	//get swagger dependency from below url path.
	//https://mvnrepository.com/artifact/io.springfox/springfox-swagger2
	//https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui/2.9.2
	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.apis(RequestHandlerSelectors.basePackage("com.plantManagementSystem.rest.endpoint"))
		.paths(PathSelectors.any())
		.build()
		.apiInfo(apiInfo());
	}
	
	@SuppressWarnings("deprecation")
	public ApiInfo apiInfo() {
		 /*
		  * Parameters to be passed to this ApiInfo constructor
		  * 
		  * title title
		  * description description
		  * version version
		  * termsOfServiceUrl terms of service
		  * contactName contact name
		  * license licence textlicenseUrl 
		  * license url
		  * 
		  */
		 return new ApiInfo("Plant Management System", 
					 "API related to control the plant management system application", 
					 "V2.0", 
					 "This is and open source API lincense",
					 "Author: Shubham S Ashtaputre.",
					 "LIC100890", 
					 "http://sample-license-url.com");
	 }
	//-------------------------------------------------------------------------------------------
	//-------------------------------------------------------------------------------------------
}
