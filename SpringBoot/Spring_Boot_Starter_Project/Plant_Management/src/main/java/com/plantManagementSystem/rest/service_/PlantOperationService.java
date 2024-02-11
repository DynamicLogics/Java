package com.plantManagementSystem.rest.service_;

import java.util.ArrayList;
import java.util.List;

import com.plantManagementSystem.rest.bean.PlantOperation;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public interface PlantOperationService {
	public String setIndividualPlantOperation(PlantOperation plantObj);
	public List<PlantOperation> getAllDepartName();
}
