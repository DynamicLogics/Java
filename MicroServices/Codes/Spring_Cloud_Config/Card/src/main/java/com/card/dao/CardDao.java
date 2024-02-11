package com.card.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.card.bean.Card;

@Repository
public interface CardDao extends JpaRepository<Card, Integer> {
	
	List<Card> findByCustomerId(int customerId);
	
}
