package com.plantManagementSystem.rest.dao_;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.plantManagementSystem.rest.bean.EmployeeDetails;

@Repository
public interface EmployeeDao extends JpaRepository<EmployeeDetails, Integer> {
	
	@Query(value = "select * from employee where userid=?1", nativeQuery = true)
	EmployeeDetails findUserbyId(int id);
}
