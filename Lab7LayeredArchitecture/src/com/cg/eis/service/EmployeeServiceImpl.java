package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;
import com.cg.exception.DetailsNotFoundException;

public class EmployeeServiceImpl implements EmployeeService {
	
	HashMap<Integer,Employee> empList = new HashMap<>();

	@Override
	public String addEmployeeDetails(int key, Employee emp) throws DetailsNotFoundException {
		
		if(emp.getEmpid()==0 || emp.getEmpname()==null || emp.getSalary()==0) {
			
			throw new DetailsNotFoundException();
		}
		
		else {
			
			String designation=designationCheck(emp.getSalary());
			emp.setDesignation(designation);
			
			String insuranceScheme= insuranceSchemeCheck(emp.getSalary());
			emp.setInsurancescheme(insuranceScheme);
			
			empList.put(key,emp);
		}
			
		return "Added successfully";
	}

	

	@Override
	public String deleteEmployeeDetails(int key) {
		
		return null;
	}

	

}
