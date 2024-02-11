package com.card.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.card.bean.Card;
import com.card.dao.CardDao;

@Service
public class CardService implements CardServIntrf {

	@Autowired
	CardDao cardRepo;
	
	@Override
	public List<Card> getCardDetailsByCustomerid(int Id) {
		return this.cardRepo.findByCustomerId(Id);
	}
	
	
	
	
}
