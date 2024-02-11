package com.BuilderPattern;

import java.util.Date;

//parent class
public class Form {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private Date dob;
	private String email;
	private String city;
	private String state;
	
	//creating an inner class
	static class FormBuilder{
		
		private String firstName;
		private String lastName;
		private String userName;
		private String password;
		private Date dob;
		private String email;
		private String city;
		private String state;
		
		public FormBuilder(String firstName,String lastName,String userName,String password) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.userName = userName;
			this.password = password;
		}
		
		public FormBuilder dob(Date dob) {
			this.dob = dob;
			return this;
		}
		
		public FormBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public FormBuilder city(String city) {
			this.city = city;
			return this;
		}
		
		public FormBuilder state(String state) {
			this.state = state;
			return this;
		}
		
		public Form build() {
			return new Form(this);
		}
		
	}	
	
	public Form(FormBuilder formBuilder) {
		this.firstName = formBuilder.firstName;
		this.lastName = formBuilder.lastName;
		this.userName = formBuilder.userName;
		this.password = formBuilder.password;
		this.dob = formBuilder.dob;
		this.email = formBuilder.email;
		this.city = formBuilder.city;
		this.state = formBuilder.state;
	}
	
	public String toString() {
			
		StringBuilder strBuild = new StringBuilder();
		strBuild.append("first name:\n");
		strBuild.append(firstName+"\n");
		strBuild.append("last name:\n");
		strBuild.append(lastName+"\n");
		strBuild.append("user name:\n");
		strBuild.append(userName+"\n");
		strBuild.append("password:\n");
		strBuild.append(password+"\n");
	
		if(this.dob!=null) {
			strBuild.append("dob:\n");
			strBuild.append(dob);
		}
		
		if(this.email!=null) {
			strBuild.append("email:\n");
			strBuild.append(email);
		}
		
		if(this.city!=null) {
			strBuild.append("city:\n");
			strBuild.append(city);
		}
		
		if(this.state!=null) {
			strBuild.append("state:\n");
			strBuild.append(state);
		}
		
		return strBuild.toString();
	
	}
	
	public static void main(String[] args) {
		
		Form form = new Form.FormBuilder("Shubham","Ashtaputre","ssa","ssa@*1234").city("Pune").build();
		System.out.println(form);
		
	}
	
}
