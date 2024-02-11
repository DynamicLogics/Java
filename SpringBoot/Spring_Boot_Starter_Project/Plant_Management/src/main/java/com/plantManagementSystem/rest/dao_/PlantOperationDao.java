package com.plantManagementSystem.rest.dao_;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.plantManagementSystem.rest.bean.PlantOperation;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Repository
public interface PlantOperationDao extends JpaRepository<PlantOperation, Integer>{
	
	@Transactional
	@Modifying
	@Query(value = "update workshop_operations set userid=?1, status=?2 where department=?3", nativeQuery = true)
	int updateWorkShopOperation(int userId, String status, String department);
	
	/*
		@Transactional
		@Query(value = "select department from WORKSHOP_OPERATIONS", nativeQuery = true)
		String getAllDepartName();
	*/
}
