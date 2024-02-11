package com.plantManagementSystem.rest.dao_;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.plantManagementSystem.rest.bean.EmployeeDetails;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Repository
public interface EmployeeDao extends JpaRepository<EmployeeDetails, Integer> {
	
	@Transactional
	@Query(value = "select userid from employee where username=?1 and password=?2", nativeQuery = true)
	int getExistingUserId(String userName, String password);
	
	@Transactional
	@Query(value = "select * from employee where userid=?1", nativeQuery = true)
	EmployeeDetails findUserbyId(int id);
	
	//return boolean value
	@Query(value = "select EXISTS(select * from employee where username=?1 and password=?2)", nativeQuery = true)
	boolean doesUserExists(String userName, String password);
	
	@Transactional
	@Modifying
	@Query(value = "update workshop_operations set userid=?1, status=?2 where department=?3", nativeQuery = true)
	void updateWorkShopOperation(int userId, String status, String department);
	
}
