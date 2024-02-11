package com.jackson.code;

public class PersonDetails {
	
	public String name;
	public String password;
	
	public PersonDetails() {
		super();
	}

	public PersonDetails(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
