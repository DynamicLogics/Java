package com.batch.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="people")
public class Person {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="personId",unique = true, nullable = false)
	public int personId;
	
	@Column(name="personName")
	public String personName;
	
	@Column(name="personSurname")
	public String personSurname;

	public Person() {
		
	}

	public Person(int personId, String personName, String personSurname) {
		//super();
		this.personId = personId;
		this.personName = personName;
		this.personSurname = personSurname;
	} 

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonSurname() {
		return personSurname;
	}

	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	} 

}
