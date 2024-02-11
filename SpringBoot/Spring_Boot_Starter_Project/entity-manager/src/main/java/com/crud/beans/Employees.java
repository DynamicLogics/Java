package com.crud.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	
	@Id
	@Column(name="employee_id", unique = true, nullable = false)
	public int employeeId;	
	
	@Column(name = "first_name")
	public String firstName;
	
	@Column(name = "last_name")
	public String lastName;
	
	@Column(name = "email")
	public String email;
	
	@Column(name = "phone_number")
	public String phoneNumber;
	
	@Column(name = "hire_date")
	public Date hireDate;
	
	@Column(name = "job_id")
	public int jobId;
	
	@Column(name = "salary")
	public int salary;
	
	@Column(name = "manager_id")
	public int managerId;
	
	@Column(name = "department_id")
	public int departmentId;

	public Employees() {
		super();
	}
	
	public Employees(int employeeId, String firstName, String lastName, String email, String phoneNumber, Date hireDate,
					 int jobId, int salary, int managerId, int departmentId) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
		this.managerId = managerId;
		this.departmentId = departmentId;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public int getJobId() {
		return jobId;
	}
	
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getManagerId() {
		return managerId;
	}
	
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId
				+ ", salary=" + salary + ", managerId=" + managerId + ", departmentId=" + departmentId + "]";
	}
	
}
