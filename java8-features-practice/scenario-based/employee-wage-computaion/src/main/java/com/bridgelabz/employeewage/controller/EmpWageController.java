package com.bridgelabz.employeewage.controller;

import com.bridgelabz.employeewage.model.Employee;
import com.bridgelabz.employeewage.service.EmpWageService;

public class EmpWageController {
	private EmpWageService service;

	public EmpWageController() {
        service = new EmpWageService();
    }

    public void computeEmployeeWage() {

        Employee tcs = service.computeEmployeeWage(
                "TCS", 20, 20, 100);

        Employee infosys = service.computeEmployeeWage(
                "Infosys", 25, 22, 110);

        Employee wipro = service.computeEmployeeWage(
                "Wipro", 30, 18, 90);
    }

}
