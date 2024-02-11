package com.plantManagementSystem.rest.dao.Implementation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.plantManagementSystem.rest.bean.EmployeeDetails;
import com.plantManagementSystem.rest.bean.TwoFactorAuthentication;
import com.plantManagementSystem.rest.constant.ServiceConstants;
import com.plantManagementSystem.rest.dao_.EmployeeDao;
import com.plantManagementSystem.rest.dao_.EmployeeServiceDao;
import com.plantManagementSystem.rest.dao_.TwoFactorAuthenticaionDao;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Service
public class EmployeeDaoImpl implements EmployeeServiceDao {
	
	@Lazy
	@Autowired
	EmployeeDao dao;
	
	@Lazy
	@Autowired
	TwoFactorAuthenticaionDao tfaDao;
	
	public static ServiceConstants serviceConstants;
	
	public static String depNames;
	
	public static TwoFactorAuthentication tfa = null;
	
	public EmployeeDetails saveEmployeeDetails(EmployeeDetails empObj) {
		//EmployeeDaoImpl empD = new EmployeeDaoImpl();
		tfa = new TwoFactorAuthentication();
		tfa.setEmployeeId(empObj.getUserId());
		tfa.setVerificationCode(0000);
		createTwoFactorAuthenticationEntry(tfa);
		//this is an inbuilt save method of JPA repository to insert values into database
		return dao.save(empObj);
	}
	
	@Override
	public void createTwoFactorAuthenticationEntry(TwoFactorAuthentication employeeObj) {
		tfaDao.save(employeeObj);
	}

	public EmployeeDetails fetchEmployeeDetails(int empId) {
		return dao.findUserbyId(empId);
	}
	
	public String removeEmployee(EmployeeDetails empObj) {
		try {
			//EmployeeDaoImpl empD = new EmployeeDaoImpl();
			tfa = new TwoFactorAuthentication();
			tfa.setEmployeeId(empObj.getUserId());
			removeTwoFactorAuthenticationEntry(tfa);
			//whenever you are going to delete a record always pass Id of that record and not any another parameter.
			//because delete method searches record by Id.
			dao.delete(empObj);
			return "Employee got successfully Terminated";
		} catch (IllegalArgumentException e) {
			return "Employee Already Terminated";
		}
	}

	@Override
	public void removeTwoFactorAuthenticationEntry(TwoFactorAuthentication employeeObj) {
		tfaDao.delete(employeeObj);
	}
	
	@Override
	public boolean validateUser(String userName, String password) {
		return dao.doesUserExists(userName, password);
	}
	
	public int getUserId(String userName, String password) {
		return dao.getExistingUserId(userName, password);
	}

	@Override
	public String setWorkShopOperations(int userId, String operationRequested){
		ArrayList<String> getAllDepartmentName = ServiceConstants.getDepartmentNames();
		//get employee details
		EmployeeDetails getEmployeeDao = dao.findUserbyId(userId);
		/*
		System.out.println("Inside DAO: "+getEmployeeDao.getPermissions()+" "+
				getEmployeeDao.getDepartmentAssigned());
		System.out.println("setWorkShopOperations: "+userId+"  "+operationRequested+" perm: "+getEmployeeDao.getPermissions());
		
		*/
		//checking if the employee have full/partial permission
		if(getEmployeeDao.getPermissions().equals("Partial")) {
			//for single workshop record update operation
			dao.updateWorkShopOperation(getEmployeeDao.getUserId(), operationRequested, getEmployeeDao.getDepartmentAssigned().toLowerCase());
			return "single record updated successfully...";
		}
		if(getEmployeeDao.getPermissions().equals("Full") && 
		   getEmployeeDao.getDepartmentAssigned().equalsIgnoreCase("all departments") ) {
			try {
				System.out.println("inside if condition: ");
				//using for loop to get all the deprtment names and set there status into database
				for (String depratNames : getAllDepartmentName) {
					depNames = depratNames;
					//for multiple workshop record update operation
					dao.updateWorkShopOperation(getEmployeeDao.getUserId(), operationRequested, depNames);
					//waiting to sometime to initiate next update operation
					Thread.sleep(500);
				}
				return "multiple record updated successfully...";
			}catch(Exception e) {
				System.out.println("Error occured while updating all departments"+"\n");
				e.printStackTrace();
			}
			
		}
		return null;
	}

}
