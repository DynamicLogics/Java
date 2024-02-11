package com.jms.sender;

import java.io.Serializable;

/*
 * Author: Shubham Ashtaputre
 * 
 */
 
public class Order implements Serializable{
	
	public String foodName;
	public int tableNumber;
	
	public Order() {
		super();
	}

	public Order(String foodName, int tableNumber) {
		super();
		this.foodName = foodName;
		this.tableNumber = tableNumber;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	
}
