package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	public String addEmployeeDetails(int key,Employee emp);
	
	public String deleteEmployeeDetails(int key);

}
