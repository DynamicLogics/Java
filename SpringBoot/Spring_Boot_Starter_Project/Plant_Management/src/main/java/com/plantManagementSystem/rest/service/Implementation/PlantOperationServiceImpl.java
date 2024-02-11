package com.plantManagementSystem.rest.service.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantManagementSystem.rest.bean.PlantOperation;
import com.plantManagementSystem.rest.dao_.PlantOperationServiceDao;
import com.plantManagementSystem.rest.service_.PlantOperationService;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Service
public class PlantOperationServiceImpl implements PlantOperationService{
	
	@Autowired
	PlantOperationServiceDao plntServDao;
	
	@Override
	public String setIndividualPlantOperation(PlantOperation plantObj) {
		return plntServDao.updateDepartmentStatus(plantObj.getUserId(), plantObj.getDepartmentStatus(), 
												  plantObj.getDepartmentName());
	}

	@Override
	public List<PlantOperation> getAllDepartName() {
		return plntServDao.getAvailableDepartmentName();
	}

}
