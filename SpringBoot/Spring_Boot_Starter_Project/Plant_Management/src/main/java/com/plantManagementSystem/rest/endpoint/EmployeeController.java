package com.plantManagementSystem.rest.endpoint;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.plantManagementSystem.rest.bean.EmployeeDetails;
import com.plantManagementSystem.rest.bean.EmployeeTerminationStatus;
import com.plantManagementSystem.rest.service_.EmployeeService;
import io.swagger.annotations.ApiOperation;

/*
* Author: Shubham.S.Ashtaputre
* License: Open Source Project
* Created Date: 16/08/2022
*/


//for allowing requests from different applications like angular etc we use @CrossOrigin
@CrossOrigin
@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@Autowired
	RestTemplate restTemplate;
	
	EmployeeTerminationStatus termStatus = null;
	
	//@ApiOperation will display information related to API's in Swagger application
	@ApiOperation(value = "Returns information related to new Employee",
				  notes = "Provide details related to new employee to create new employee",
				  response = EmployeeDetails.class )
	@PostMapping(path="addEmployee",
				 consumes=MediaType.APPLICATION_JSON_VALUE,
				 produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDetails addNewEmployee(@RequestBody EmployeeDetails empObj) {
		//System.out.println("Inside post method ---> "+empObj.getEmail());
		return empService.addNewEmployees(empObj);
	}
	
	@ApiOperation(value = "Generates a PDF file containing information related to new employee",
	  	  	  notes = "Provide user-id for the newly inserted employee record",
	  	  	  response = EmployeeDetails.class )
	//@ResponseBody
	@GetMapping(path="generateEmployeeRecord",
			    produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDetails generateEmployeeRecord(@RequestParam(value = "userId") int userId) {
		return empService.generateEmployeeRecord(userId);
	}
	
	@ApiOperation(value = "Returns information related to existing Employee",
			  	  notes = "Provide user-id related to existing employee to fetch employee record",
			  	  response = EmployeeDetails.class )
	//consumes=MediaType.APPLICATION_JSON_VALUE,
	//@ResponseBody
	
	@GetMapping(path="fetchEmployeeRecord",
			    produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDetails fetchEmployeeRecord(@RequestParam(value = "userId") int userId) {
		return empService.viewExistingEmployees(userId);
	}
	
	@ApiOperation(value = "Removes the existing employee from organization",
		  	  	  notes = "Provide user-id related to existing employee to remove employee record",
		  	  	  response = EmployeeDetails.class )
	//@ResponseBody
	@DeleteMapping(path="removeEmployeeRecord",
				   produces=MediaType.APPLICATION_JSON_VALUE)
	//Provide user-id related to existing employee to remove employee record,
	public EmployeeTerminationStatus removeEmployeeRecord(@RequestParam(value = "userId") EmployeeDetails userId) {
		//whenever you are going to delete a record always pass Id of that record and not any another parameter.
		termStatus = new EmployeeTerminationStatus();
		termStatus.setTerminationStatus(empService.removeExistingEmployees(userId));
		return termStatus;
	}
	
}
