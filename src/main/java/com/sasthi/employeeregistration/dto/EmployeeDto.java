package com.sasthi.employeeregistration.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable{
	
	private String name;
	private String age;
	private String gender;
	private String address;
	
	
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "EmployeeDto [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	
}
