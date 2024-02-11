package com.interceptor.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	//http://localhost:8080/employee/record?id=1&name="Shubham"
	@GetMapping(path="/record",
				produces = MediaType.APPLICATION_JSON_VALUE)
	public static String getEmployeeRecords(@RequestParam(value="id") int employeeId) {
		return "employee record found...";
	}
	
}
