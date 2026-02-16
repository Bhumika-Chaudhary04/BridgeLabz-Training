package com.bridgelabz.employeewage.controller;

import com.bridgelabz.employeewage.model.Employee;
import com.bridgelabz.employeewage.service.EmpWageService;

public class EmpWageController {
	private EmpWageService service;

	public EmpWageController() {
		service = new EmpWageService(20,20,100);
	}

	public void computeEmployeeWage() {

		Employee employee = service.computeEmployeeWage();

		System.out.println("----------------------------------");
		System.out.println("Total Wage : " + employee.getTotalWage());

	}
}
