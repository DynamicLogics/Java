package com.read_data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//below two annotations are used for mapping out java code to our student database in mysql.
@Entity
@Table(name="student")

public class Student3 {

	//creating the variables and mapping them accordingly to student database columns
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName ;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;

	//no-args constructor
	public Student3() {
		
	}
	
	public Student3(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	//generate getters and setters	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//we are just using it for code debugging purpose
	@Override
	public String toString() {
		return "Student3 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}	
	
	
	
}
