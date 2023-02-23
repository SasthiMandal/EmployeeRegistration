package com.sasthi.employeeregistration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sasthi.employeeregistration.constant.AppConstant;

@Entity
@Table(name=AppConstant.EMPLOYEE_INFORMATION)
public class EmployeeModel implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="emp_id")
	private Long id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_age")
	private String age;
	@Column(name="emp_gender")
	private String gender;
	@Column(name="emp_address")
	private String address;
	
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "EmployeeModel [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address="
				+ address + "]";
	}
		
}
