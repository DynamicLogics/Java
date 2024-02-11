package com.plantManagementSystem.rest.bean;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public class PlantOperationStatus {
	
	String plantStatus;

	public PlantOperationStatus() {
		super();
	}

	public PlantOperationStatus(String plantStatus) {
		super();
		this.plantStatus = plantStatus;
	}

	public String getPlantStatus() {
		return plantStatus;
	}

	public void setPlantStatus(String plantStatus) {
		this.plantStatus = plantStatus;
	}
	
}
