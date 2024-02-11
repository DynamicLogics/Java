package com.plantManagementSystem.rest.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantManagementSystem.rest.bean.EmployeeDetails;
import com.plantManagementSystem.rest.dao.Implementation.EmployeeDaoImpl;
import com.plantManagementSystem.rest.dao_.EmployeeDao;
import com.plantManagementSystem.rest.dao_.EmployeeServiceDao;
import com.plantManagementSystem.rest.service_.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeServiceDao empDaoServ;
	
	@Override
	public EmployeeDetails addNewEmployees(EmployeeDetails empObj) {
		return empDaoServ.saveEmployeeDetails(empObj);
	}

	@Override
	public EmployeeDetails viewExistingEmployees(int userId) {
		return empDaoServ.fetchEmployeeDetails(userId);
	}
	
	@Override
	public String removeExistingEmployees(EmployeeDetails empObj) {
		return empDaoServ.removeEmployee(empObj);
	}

}
