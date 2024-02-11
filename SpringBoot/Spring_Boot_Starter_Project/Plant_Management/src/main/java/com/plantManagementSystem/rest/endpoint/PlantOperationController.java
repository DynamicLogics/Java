package com.plantManagementSystem.rest.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plantManagementSystem.rest.bean.EmployeeDetails;
import com.plantManagementSystem.rest.bean.PlantOperation;
import com.plantManagementSystem.rest.bean.PlantOperationStatus;
import com.plantManagementSystem.rest.service_.EmployeeService;
import com.plantManagementSystem.rest.service_.PlantOperationService;

import io.swagger.annotations.ApiOperation;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@CrossOrigin
@RestController
@RequestMapping("plantOperations")
public class PlantOperationController {
	
	@Autowired
	EmployeeService empService;
	
	@Autowired
	PlantOperationService plantService;
	
	PlantOperationStatus plntOprStts;
	
	//as I'am updating existing values inside databse that why I'am using put method instead of post method
	@ApiOperation(value = "Sets the status of all Departments",
	  	  	  	  notes = "Provide user-id and status of the department",
	  	  	      response = EmployeeDetails.class)
	@PutMapping(path="completeDepartments",
				consumes=MediaType.APPLICATION_JSON_VALUE,
				produces=MediaType.APPLICATION_JSON_VALUE)
	public PlantOperationStatus multipleWorkShopOperation(@RequestBody PlantOperation plantObj) {
		return new PlantOperationStatus(empService.newWorkshopOperations(plantObj));
	}
	
	@ApiOperation(value = "Sets the status of individual Department",
	  	  	  	  notes = "Provide user-id and status of the department",
	  	  	  	  response = PlantOperationStatus.class)
	@PutMapping(path="individualDepartment",
				consumes=MediaType.APPLICATION_JSON_VALUE,
				produces=MediaType.APPLICATION_JSON_VALUE)
	public PlantOperationStatus singleWorkShopOperation(@RequestBody PlantOperation plantObj) {
		return new PlantOperationStatus(plantService.setIndividualPlantOperation(plantObj));
	}
	
	@ApiOperation(value = "Gets the list of all Department",
	  	  	 	  notes = "no parameters needed to be passed",
	  	  	 	  response = EmployeeDetails.class)
	@GetMapping(value="getAvailableDepartmentName",
				produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PlantOperation> getVariousDepartName(){
		return plantService.getAllDepartName();
	}
	
}
