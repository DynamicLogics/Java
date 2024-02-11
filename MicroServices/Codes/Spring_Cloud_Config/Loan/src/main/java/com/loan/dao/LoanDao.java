package com.loan.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loan.bean.Loan;

@Repository
public interface LoanDao extends JpaRepository<Loan, Integer> {
	
	List<Loan> findByCustomerIdOrderByStartDtDesc(int customerId);
	
}
