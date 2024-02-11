package com.plantManagementSystem.rest.endpoint;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.plantManagementSystem.rest.bean.EmployeeDetails;
import com.plantManagementSystem.rest.dao.Implementation.EmployeeDaoImpl;
import com.plantManagementSystem.rest.dao_.EmployeeDao;
import com.plantManagementSystem.rest.service_.EmployeeService;

@CrossOrigin
@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@PostMapping(path="addEmployee",
				 consumes=MediaType.APPLICATION_JSON_VALUE,
				 produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDetails addNewEmployee(@RequestBody EmployeeDetails empObj) {
		System.out.println("Inside post method ---> "+empObj.getEmail());
		return empService.addNewEmployees(empObj);
	}

	@ResponseBody
	@GetMapping(path="fetchEmployeeRecord",
			    consumes=MediaType.APPLICATION_JSON_VALUE,
			    produces=MediaType.APPLICATION_JSON_VALUE)
	public EmployeeDetails fetchEmployeeRecord(@RequestParam(value = "userId") int userId) {
		System.out.println("Inside get method ---> "+userId);
		return empService.viewExistingEmployees(userId);
	}
	
	@ResponseBody
	@DeleteMapping(path="removeEmployeeRecord",
				   consumes=MediaType.APPLICATION_JSON_VALUE,
				   produces=MediaType.APPLICATION_JSON_VALUE)
	public String removeEmployeeRecord(@RequestParam(value = "userId") EmployeeDetails userId) {
		//whenever you are going to delete a record always pass Id of that record and not any another parameter.
		System.out.println("Inside get method ---> "+userId.getUserId()+" "+userId.getUserName());
		return empService.removeExistingEmployees(userId);
	}
	
	
	
}
