package com.sasthi.employeeregistration.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sasthi.employeeregistration.model.EmployeeModel;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{

	List<EmployeeModel> findByName(String name);

	List<EmployeeModel> findByAge(String age);

	List<EmployeeModel> findByGender(String gender);

	List<EmployeeModel> findByAddress(String address);

	EmployeeModel findByNameAndAddress(String name, String address);

	List<EmployeeModel> findByNameOrAddress(String name, String address);

	List<EmployeeModel> findByAddressOrderByNameAsc(String address);

	List<EmployeeModel> findByAddressOrderByAddressAsc(String address);

	List<EmployeeModel> findByAddressOrderByAgeAsc(String address);

}
