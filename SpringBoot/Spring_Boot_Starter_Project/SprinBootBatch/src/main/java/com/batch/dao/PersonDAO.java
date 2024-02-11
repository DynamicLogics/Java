package com.batch.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.batch.bean.Person;

@Repository
public interface PersonDAO extends JpaRepository<Person, Integer>{
	
}
