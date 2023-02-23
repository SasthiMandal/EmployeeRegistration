package com.sasthi.employeeregistration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sasthi.employeeregistration.constant.AppConstant;
import com.sasthi.employeeregistration.dto.EmployeeDto;
import com.sasthi.employeeregistration.model.EmployeeModel;
import com.sasthi.employeeregistration.service.EmployeeService;

@Controller
@RequestMapping(value = AppConstant.EMPLOYEE_API)
@ResponseBody
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value = AppConstant.SAVE_EMPLOYEE)
	public void saveEmployee(@RequestBody EmployeeDto employeeDto)
	{
		employeeService.saveEmployee(employeeDto);
	}
	
	@PostMapping(value = AppConstant.SAVE_ALL_EMPLOYEE)
	public void saveAll(@RequestBody List<EmployeeModel> employeeList)
	{
		employeeService.saveAll(employeeList);
	}
	
	@GetMapping(value = AppConstant.GET_ALL_EMPLOYEE)
	public @ResponseBody List<EmployeeModel> getAllEmployee()
	{
		return employeeService.getAllEmployee();
	}
	
	@GetMapping(value = AppConstant.GET_BY_NAME)
	public @ResponseBody List<EmployeeModel> getByName(String name)
	{
		return employeeService.getByName(name);
	}
	
	@GetMapping(value = AppConstant.GET_BY_AGE)
	public @ResponseBody List<EmployeeModel> getByAge(String age)
	{
		return employeeService.getByAge(age);
	}
	
	@GetMapping(value = AppConstant.GET_BY_GENDER)
	public @ResponseBody List<EmployeeModel> getByGender(String gender)
	{
		return employeeService.getByGender(gender);
	}
	
	@GetMapping(value = AppConstant.GET_BY_ADDRESS)
	public @ResponseBody List<EmployeeModel> getByAddress(String address)
	{
		return employeeService.getByAddress(address);
	}
	
	@GetMapping(value = AppConstant.GET_BY_ID)
	public @ResponseBody Optional<EmployeeModel> getById(Long id)
	{
		return employeeService.getbyId(id);
	}
	
	@PatchMapping(value = AppConstant.PATCH_UPDATE_EMPLOYEE)
	public void patchUpdate(@PathVariable Long id)
	{
		employeeService.patchUpdate(id);
	}
	
	@PutMapping(value = AppConstant.PUT_UPDATE_EMPLOYEE)
	public void putUpdate(@PathVariable Long id)
	{
		employeeService.putUpdate(id);
	}
	
	@DeleteMapping(value = AppConstant.DELETE_EMPLOYEE_BY_ID)
	public void deleteEmployee(@PathVariable Long id)
	{
		employeeService.deleteEmployee(id);
	}
	
	@DeleteMapping(value = AppConstant.DELETE_ALL_EMPLOYEE)
	public void deleteAll()
	{
		employeeService.deleteAll();
	}
	
	@GetMapping(value=AppConstant.FIND_BY_EMPLOYEE_NAME_AND_ADDRESS)
	public @ResponseBody EmployeeModel findByNameAndAddress(String name,String address)
	{
		return employeeService.findByNameAndAddress(name,address);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_EMPLOYEE_NAME_OR_ADDRESS)
	public @ResponseBody List<EmployeeModel> findByNameOrAddress(String name,String address)
	{
		return employeeService.findByNameOrAddress(name,address);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_ADDRESS_ORDER_BY_EMP_NAME_ASC)
	public @ResponseBody List<EmployeeModel> findByAddressOrderByNameAsc(String address)
	{
		
		return employeeService.findByAddressOrderByNameAsc(address);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_ADDRESS_ORDER_BY_ADDRESS_ASC)
	public @ResponseBody List<EmployeeModel> findByAddressOrderByAddressAsc(String address)
	{
		
		return employeeService.findByAddressOrderByAddressAsc(address);
	}
	
	@GetMapping(value=AppConstant.FIND_BY_ADDRESS_ORDER_BY_EMP_AGE_ASC)
	public @ResponseBody List<EmployeeModel> findByAddressOrderByAgeAsc(String address)
	{
		
		return employeeService.findByAddressOrderByAgeAsc(address);
	}
}
