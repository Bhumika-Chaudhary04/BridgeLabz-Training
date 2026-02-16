package com.bridgelabz.employeewage.controller;

import com.bridgelabz.employeewage.model.CompanyEmpWage;
import com.bridgelabz.employeewage.service.EmpWageBuilder;

public class EmpWageController {
	private EmpWageBuilder builder;

	public EmpWageController() {
		builder = new EmpWageBuilder();
	}

	public void computeEmployeeWage() {

		CompanyEmpWage tcs = new CompanyEmpWage("TCS", 20, 20, 100);

		CompanyEmpWage infosys = new CompanyEmpWage("Infosys", 25, 22, 110);
		builder.computeEmployeeWage(tcs);
		builder.computeEmployeeWage(infosys);
	}

}
