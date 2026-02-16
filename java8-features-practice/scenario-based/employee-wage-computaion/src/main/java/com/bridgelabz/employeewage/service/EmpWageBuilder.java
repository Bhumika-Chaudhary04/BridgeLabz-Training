package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.CompanyEmpWage;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class EmpWageBuilder implements IEmpWageBuilder {

	private static final int FULL_TIME = 1;
	private static final int PART_TIME = 2;

	private static final int FULL_TIME_HOURS = 8;
	private static final int PART_TIME_HOURS = 4;

	private List<CompanyEmpWage> companyList;

	public EmpWageBuilder() {
		companyList = new ArrayList<>();
	}

	@Override
	public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {

		CompanyEmpWage company = new CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);

		companyList.add(company);
	}

	@Override
	public void computeEmployeeWage() {

		for (CompanyEmpWage company : companyList) {

			int totalHours = 0;
			int totalDays = 0;
			int totalWage = 0;

			Random random = new Random();

			System.out.println("Computing wage for " + company.getCompanyName());

			while (totalHours < company.getMaxWorkingHours() && totalDays < company.getMaxWorkingDays()) {

				totalDays++;

				int empCheck = random.nextInt(3);
				int workingHours = 0;

				switch (empCheck) {
				case FULL_TIME:
					workingHours = FULL_TIME_HOURS;
					break;
				case PART_TIME:
					workingHours = PART_TIME_HOURS;
					break;
				default:
					workingHours = 0;
				}

				totalHours += workingHours;
				totalWage += workingHours * company.getWagePerHour();
			}

			company.setTotalWage(totalWage);

			System.out.println("Total Wage for " + company.getCompanyName() + " = " + company.getTotalWage());

			System.out.println("--------------------------------");
		}
	}
}
