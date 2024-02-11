package com.plantManagementSystem.rest.dao.Implementation;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MissingServletRequestParameterException;

import com.plantManagementSystem.rest.bean.EmployeeDetails;
import com.plantManagementSystem.rest.dao_.EmployeeDao;
import com.plantManagementSystem.rest.dao_.EmployeeServiceDao;

@Service
public class EmployeeDaoImpl implements EmployeeServiceDao{
	
	@Lazy
	@Autowired
	EmployeeDao dao;
	
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails empObj) {
		return dao.save(empObj);
	}

	public EmployeeDetails fetchEmployeeDetails(int empId) {
		return dao.findUserbyId(empId);
	}
	
	public String removeEmployee(EmployeeDetails empObj) {
		try {
			System.out.println("Inside Try Method");
			//whenever you are going to delete a record always pass Id of that record and not any another parameter.
			//because delete method searches record by Id.
			dao.delete(empObj);
			return "Employee got successfully Terminated";
		} catch (IllegalArgumentException e) {
			System.out.println("Inside Catch Method");
			return "Employee Already Terminated";
		}
		
	}
	
	
}
