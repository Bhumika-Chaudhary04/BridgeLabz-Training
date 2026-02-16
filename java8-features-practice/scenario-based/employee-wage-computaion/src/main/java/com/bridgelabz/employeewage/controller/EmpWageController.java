package com.bridgelabz.employeewage.controller;

import com.bridgelabz.employeewage.service.IEmpWageBuilder;
import com.bridgelabz.employeewage.service.EmpWageBuilder;

public class EmpWageController {
	private IEmpWageBuilder builder;

	public EmpWageController() {
		builder = new EmpWageBuilder();
	}

	public void computeEmployeeWage() {

		builder.addCompany("TCS", 20, 20, 100);
		builder.addCompany("Infosys", 25, 22, 110);
		builder.addCompany("Wipro", 30, 18, 90);

		builder.computeEmployeeWage();
	}

}
