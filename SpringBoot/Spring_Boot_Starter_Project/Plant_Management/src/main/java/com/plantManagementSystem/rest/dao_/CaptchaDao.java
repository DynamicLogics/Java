package com.plantManagementSystem.rest.dao_;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.plantManagementSystem.rest.bean.Captcha;

/*
* Author: Shubham.S.Ashtpautre
* License: Open Source Project
* Created Date: 16/08/2022
*/


@Repository
public interface CaptchaDao extends JpaRepository<Captcha, Integer> {
	
	@Query(value = "select count(*) from captcha_verify", nativeQuery = true)
	int getTotalCaptchaCount();
	
	@Query(value = "select imagename from captcha_verify where rowid=?1", nativeQuery = true)
	String getImageName(int value);
	
	@Query(value = "select EXISTS(select * from captcha_verify where imagename=?1 and captchavalue=?2)", nativeQuery = true)
	boolean captchaValidate(String imageName, int value);
	
}
