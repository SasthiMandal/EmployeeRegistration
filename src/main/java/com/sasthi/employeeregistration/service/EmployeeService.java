package com.sasthi.employeeregistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasthi.employeeregistration.dto.EmployeeDto;
import com.sasthi.employeeregistration.model.EmployeeModel;
import com.sasthi.employeeregistration.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void saveEmployee(EmployeeDto employeeDto) {
			EmployeeModel model = new EmployeeModel();
			model.setName(employeeDto.getName());
			model.setAge(employeeDto.getName());
			model.setGender(employeeDto.getGender());
			model.setAddress(employeeDto.getAddress());
			
			employeeRepository.save(model);
	}

	public List<EmployeeModel> getAllEmployee() {
		return employeeRepository.findAll();
	}

	public List<EmployeeModel> getByName(String name) {
		return employeeRepository.findByName(name);
	}

	public List<EmployeeModel> getByAge(String age) {
		return employeeRepository.findByAge(age);
	}

	public List<EmployeeModel> getByGender(String gender) {
		return employeeRepository.findByGender(gender);
	}

	public List<EmployeeModel> getByAddress(String address) {
		return employeeRepository.findByAddress(address);
	}

	public Optional<EmployeeModel> getbyId(Long id) {
		return employeeRepository.findById(id);
	}

	public void patchUpdate(Long id) {
		Optional<EmployeeModel> optional = employeeRepository.findById(id);
		EmployeeModel model = optional.get();
		model.setAge("30");
		
		employeeRepository.save(model);
	}

	public void putUpdate(Long id) {
		Optional<EmployeeModel> optional = employeeRepository.findById(id);
		EmployeeModel model = optional.get();
		model.setName("Ataur");
		model.setAge("28");
		model.setGender("Male");
		model.setAddress("Jongi Pur");
		
		employeeRepository.save(model);
	}

	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}

	public void deleteAll() {
		employeeRepository.deleteAll();
	}

	public EmployeeModel findByNameAndAddress(String name, String address) {
		return employeeRepository.findByNameAndAddress(name,address);
	}

	public List<EmployeeModel> findByNameOrAddress(String name, String address) {
		return employeeRepository.findByNameOrAddress(name,address);
	}

	public List<EmployeeModel> findByAddressOrderByNameAsc(String address) {
		return employeeRepository.findByAddressOrderByNameAsc(address);
	}

	public List<EmployeeModel> findByAddressOrderByAddressAsc(String address) {
		return employeeRepository.findByAddressOrderByAddressAsc(address);
	}

	public List<EmployeeModel> findByAddressOrderByAgeAsc(String address) {
		return employeeRepository.findByAddressOrderByAgeAsc(address);
	}

	public void saveAll(List<EmployeeModel> employeeList) {
			employeeRepository.saveAll(employeeList);
	}

}
