package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.CompanyEmpWage;
import java.util.Random;

public class EmpWageBuilder implements IEmpWageBuilder {

	private static final int FULL_TIME = 1;
	private static final int PART_TIME = 2;

	private static final int FULL_TIME_HOURS = 8;
	private static final int PART_TIME_HOURS = 4;

	private CompanyEmpWage[] companyArray;
	private int numberOfCompanies;

	public EmpWageBuilder(int maxCompanies) {
		companyArray = new CompanyEmpWage[maxCompanies];
		numberOfCompanies = 0;
	}

	// Add company to array
	public void addCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {

		companyArray[numberOfCompanies] = new CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);

		numberOfCompanies++;
	}

	@Override
	public void computeEmployeeWage() {

		for (int i = 0; i < numberOfCompanies; i++) {

			CompanyEmpWage company = companyArray[i];

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
