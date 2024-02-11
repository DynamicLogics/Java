package com.plantManagementSystem.rest.dao.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plantManagementSystem.rest.bean.PlantOperation;
import com.plantManagementSystem.rest.dao_.PlantOperationDao;
import com.plantManagementSystem.rest.dao_.PlantOperationServiceDao;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/

@Service
public class PlantOperationServiceDaoImpl implements PlantOperationServiceDao{

	@Autowired
	PlantOperationDao plntDao;
	
	List<PlantOperation> getDepartmentList;
	List<PlantOperation> getAllDepartmentList;
	public static int departmentCounter;
	
	/*
	   creating a recursive function to set all the departments paused if one or more departments
	   are in shutdown mode and rest departments are in reboot mode
	*/
	public int pauseDepartmentStatus(List<PlantOperation> getAllDepartmentList, int counter) {
		//getting the the total number of departments count
		departmentCounter = counter;
		if(departmentCounter==-1 || departmentCounter==-2) {
			return -1;
		}else {
			if(getAllDepartmentList.get(departmentCounter).getDepartmentStatus().equals("shutdown")) {
				departmentCounter = departmentCounter-1;
				pauseDepartmentStatus(getAllDepartmentList,departmentCounter);
			}else {
				if(plntDao.updateWorkShopOperation(
				   getAllDepartmentList.get(departmentCounter).getUserId(), 
				   "paused", 
				   getAllDepartmentList.get(departmentCounter).getDepartmentName())==1) {
					departmentCounter = departmentCounter-1;
					pauseDepartmentStatus(getAllDepartmentList,departmentCounter);
					return 0;
				}else {
					System.out.println("error updating department status");
				}
			}
		}
		return 0;
	}

	@Override
	public String updateDepartmentStatus(int userId, String operationRequested, String departmentName) {
		//here if the db method returns value as '1' then the query ran successfully else
		//query ran unsuccessfully
		if(plntDao.updateWorkShopOperation(userId, operationRequested, departmentName)==1) {
			/*
				now below code will check if from all the available departments if even a single department is
				shutdown then rest of the department status will be set to 'pause' instead of 'reboot'
				and if all the departments are either completely shutdown or rebooted then there will be no change
				also if another department staus is set to shutdown then if there exists an department whose
				status is already 'shutdown' then that department status will remain 'shutdown' only and will
				not be changed to 'paused' along will other departments which were in 'reboot' state.
			*/
			getAllDepartmentList =  plntDao.findAll();
			
			for (int i=0;i<getAllDepartmentList.size();i++) {
				if(getAllDepartmentList.get(i).getDepartmentStatus().equals("shutdown")) {
					if(pauseDepartmentStatus(getAllDepartmentList,getAllDepartmentList.size()-1)==-1) {
						//exiting the for loop
						break;
					}
				}
			}
			getAllDepartmentList.clear();
			return departmentName+" department operation completed successfully...";
		}else {
			return "Error occured while completing "+departmentName+" department operation...";
		}
	}

	@Override
	public List<PlantOperation> getAvailableDepartmentName() {
		getDepartmentList = plntDao.findAll();
		/*for (PlantOperation depnameList : getDepartmentList) {
			System.out.println(depnameList.getDepartmentName());
			departmentName.add(depnameList.getDepartmentName());
		}*/
		return getDepartmentList;
	}
	
}
