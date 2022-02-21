package com.stream.api.repository;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeRepository {
	public static void main(String[] args) {
		
		Department dept = new Department(1, 10, "abc");
		Department dept1 = new Department(2, 20, "xyz");
		List<Employee> empList = new ArrayList<Employee>();
		
				empList = Arrays.asList(new Employee(100, 1, "Ahsan", "Momin", "ahsan7@gmail.com", "9558125528", "Analyst",LocalDate.of(2022, 1, 20), 25000d, dept),
				new Employee(101, 2, "sam", "root", "sam1@gmail.com", "8462684836", "SE",LocalDate.of(2020, 4, 15), 30000d, dept1),
				new Employee(102, 1, "rohit", "Sharma", "sharma@gmail.com", "9842549675", "Analyst",LocalDate.of(2015, 6, 25), 26000d, dept),
				new Employee(103, 1, "virat", "kohli", "kohli@gmail.com", "864289331", "Senior Analyst",LocalDate.of(2014, 6, 10), 20000d, dept),
				new Employee(104, 1, "KL", "rahul", "rahul@gmail.com", "8455487314", "Analyst",LocalDate.of(2018, 4, 20), 23000d, dept),
				new Employee(105, 2, "AB", "De", "abd@gmail.com", "564855311", "Executive",LocalDate.of(2021, 4, 30), 20000d, dept1));
				for (Employee e : empList) {
					System.out.println(e);
					}
					System.out.println(" Find out the sum of salary of all employees.\n");
					Optional<Double> optional = empList.stream().map(emp -> emp.getSalary()).reduce((a, b) -> (a + b));
					
					if (optional.isPresent()) {
					System.out.println("Sum of all Salaries: " + optional.get());
					}
					
					System.out.println("--------------------------------------------------------------------------------------------------");
					
					System.out.println("List out department names and count of employees in each department\n");
					Map<Department, Long> de = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
					System.out.println(de);
					LocalDate d = LocalDate.now();
					
					System.out.println("-------------------------------------------------------------------------------------------------------");
					System.out.println("List employee name and duration of their service in months and days\n");
		
					empList.forEach(e -> System.out.println(e.getFirstName() + "\t " + Period.between(d, e.getHireDate())));
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("Sort employees by their\r\nEmployee id\r\nDepartment id\r\nFirst name\n");
					
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("\nsorting by employee id: \n");
		
					List<Employee> emp1 = empList.stream().sorted((a, b) -> a.getId() - (b.getId())).collect(Collectors.toList());
					System.out.println(emp1);
		
					for (Object a : emp1) {
						
					System.out.println(a);
					}
					System.out.println("-------------------------------------------------------------------------------------------------------------");
		
					System.out.println("sorting by First Name: ");
					emp1 = empList.stream().sorted(Comparator.comparing(Employee::getFirstName)).collect(Collectors.toList());
					System.out.println(emp1);
					for (Object a : emp1) {
						
					System.out.println(a);
					}
					
					System.out.println("-----------------------------------------------------------------------------------------------------------");
					System.out.println(" Find departments with highest count of employees.");
					de = empList.stream().limit(1).collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
					System.out.println(de);
					
					for (Object a : emp1) {
					System.out.println(a);
		}
	}
}
