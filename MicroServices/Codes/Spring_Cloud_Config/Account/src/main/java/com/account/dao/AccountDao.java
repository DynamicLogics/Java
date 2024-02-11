package com.account.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.account.bean.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {
	
	//@Transactional
	//@Query(name = "select * from accounts where customer_id=?", nativeQuery = true)
	/*here you don't need to write query as the method name declared below will act
	  as a query and  'CustomerId' in method name as our column name
	*/ 
	Account findByCustomerId(int customerid);
	
}
