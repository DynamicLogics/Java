package com.plantManagementSystem.rest.constant;

import java.util.ArrayList;

import com.plantManagementSystem.rest.bean.EmployeeDetails;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public class ServiceConstants {
	
	public static String PDF_GENERATION_PATH = "E:/Programming/Java/Spring_Boot_Starter_Project/Plant_Management/Generated Resources/Generated Reports/";
	
	public static String plantName = "Smile Entertainment and Services Pvt. Ltd.";
	
	public static String authorName = "Shubham S Ashtaputre";
	
	public static String infoA = "Please find your details below in case of any changes required please do contact us at below email address";
	
	public static String companyName = "Smile Entertainment and Services Pvt. Ltd.";
	
	public static String supportEmailAddress = "Email: support@smile.entertainment.com";
	
	public static ArrayList<String> employeeFields = new ArrayList<>();
	
	public static ArrayList<String> employeeValues = new ArrayList<>();
	
	public static ArrayList<String> departmentNames = new ArrayList<>();
	
	public static ArrayList<String> getEmployeeFields(){
		employeeFields.add("USER-ID");
		employeeFields.add("USER-NAME");
		employeeFields.add("PASSWORD");
		employeeFields.add("D.O.B");
		employeeFields.add("EMAIL");
		employeeFields.add("DEPARTMENT-ASSIGNED");
		employeeFields.add("ADDRESS");
		employeeFields.add("NATIONALITY");
		employeeFields.add("PERMISSIONS");
		return employeeFields;
	}
	
	public static ArrayList<String> setEmployeeRecords(EmployeeDetails empObj){
		employeeValues.add(String.valueOf(empObj.getUserId()));
		employeeValues.add(empObj.getUserName());
		employeeValues.add(empObj.getPassword());
		employeeValues.add(empObj.getDob());
		employeeValues.add(empObj.getEmail());
		employeeValues.add(empObj.getDepartmentAssigned());
		employeeValues.add(empObj.getAddress());
		employeeValues.add(empObj.getNationality());
		employeeValues.add(empObj.getPermissions());
		return employeeValues;
	}
	
	public static ArrayList<String> getDepartmentNames(){
		departmentNames.add("pcb tray");
		departmentNames.add("pcb scanning");
		departmentNames.add("component placements");
		departmentNames.add("soldering station");
		departmentNames.add("disposal area");
		departmentNames.add("delivery");
		departmentNames.add("packaging");
		departmentNames.add("testing");
		departmentNames.add("software installation");
		return departmentNames;
	}
}
