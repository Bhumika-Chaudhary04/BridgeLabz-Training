package com.bridgelabz.employeewage.controller;

import com.bridgelabz.employeewage.model.CompanyEmpWage;
import com.bridgelabz.employeewage.service.EmpWageBuilder;

public class EmpWageController {
	private EmpWageBuilder builder;

	public EmpWageController() {
		builder = new EmpWageBuilder(5);
	}

	public void computeEmployeeWage() {

		builder.addCompany("TCS", 20, 20, 100);
		builder.addCompany("Infosys", 25, 22, 110);
		builder.addCompany("Wipro", 30, 18, 90);

		builder.computeEmployeeWage();
	}

}
