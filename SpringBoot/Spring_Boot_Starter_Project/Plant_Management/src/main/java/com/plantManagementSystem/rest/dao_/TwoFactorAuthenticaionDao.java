package com.plantManagementSystem.rest.dao_;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.plantManagementSystem.rest.bean.TwoFactorAuthentication;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


public interface TwoFactorAuthenticaionDao  extends JpaRepository<TwoFactorAuthentication, Integer> {
	
	/*
	 * sometime the custom queries won't work so in that case to execute that queries use the below annotations
	 * 	@Transactional
	 *	@Modifying
	 * then our custom queries will get executed
	 */
	@Transactional
	@Modifying
	@Query(value = "update two_factor_authentication set authenticatecode=?2 where employeeid=?1", nativeQuery = true)
	public void insertOtpValue(int userId,int getRandomValue);
	
	@Query(value = "select authenticatecode from two_factor_authentication where employeeid=?1", nativeQuery = true)
	public int fetchOtpValue(int userId);
	
	@Query(value="select EXISTS(select * from two_factor_authentication where authenticatecode=?1 and employeeid=?2)",
		  nativeQuery = true)
	public boolean matchOtp(int otpCode,int userId);
	
}
