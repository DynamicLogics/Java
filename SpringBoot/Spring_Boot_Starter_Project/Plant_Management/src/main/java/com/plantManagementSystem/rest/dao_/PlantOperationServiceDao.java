package com.plantManagementSystem.rest.dao_;

import java.util.ArrayList;
import java.util.List;

import com.plantManagementSystem.rest.bean.PlantOperation;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public interface PlantOperationServiceDao {
	public String updateDepartmentStatus(int userId, String operationRequested, String departmentName);
	public List<PlantOperation> getAvailableDepartmentName();
}
