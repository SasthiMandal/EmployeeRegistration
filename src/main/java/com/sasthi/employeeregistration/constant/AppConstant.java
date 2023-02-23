package com.sasthi.employeeregistration.constant;

public interface AppConstant {
	
	public static String EMPLOYEE_INFORMATION="employee_info16";
	public static String EMPLOYEE_API="/api";
	public static String SAVE_EMPLOYEE="/save";
	public static String SAVE_ALL_EMPLOYEE="/saveAll";
	public static String GET_ALL_EMPLOYEE="/getAll";
	public static String PATCH_UPDATE_EMPLOYEE="/patchUpdate/{id}";
	public static String PUT_UPDATE_EMPLOYEE="/putUpdate/{id}";
	public static String DELETE_EMPLOYEE_BY_ID="/delete/{id}";
	public static String DELETE_ALL_EMPLOYEE="/deleteAll";
	public static String GET_BY_ADDRESS="/getAddress/{address}";
	public static String GET_BY_NAME="/getName/{name}";
	public static String GET_BY_AGE="/getAge/{age}";
	public static String GET_BY_ID="/getId/{id}";
	public static String GET_BY_GENDER="/getGender/{gender}";
	public static String FIND_BY_EMPLOYEE_NAME_AND_ADDRESS="/findByNameAndAddress";
	public static String FIND_BY_EMPLOYEE_NAME_OR_ADDRESS="/findByNameOrAddress";
	public static String FIND_BY_ADDRESS_ORDER_BY_EMP_NAME_ASC="/findByAddressOrderByNameAsc";
	public static String FIND_BY_ADDRESS_ORDER_BY_ADDRESS_ASC="/findByAddressOrderByAddressAsc";
	public static String FIND_BY_ADDRESS_ORDER_BY_EMP_AGE_ASC="/findByAddressOrderByAgeAsc";

}
