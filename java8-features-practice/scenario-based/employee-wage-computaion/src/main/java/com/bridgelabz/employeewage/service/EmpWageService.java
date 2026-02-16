package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.Employee;
import java.util.Random;

public class EmpWageService {
	private static final int WAGE_PER_HOUR = 20;
	private static final int FULL_TIME_HOURS = 8;
	private static final int PART_TIME_HOURS = 4;
	private static final int MAX_WORKING_DAYS = 20;
	private static final int MAX_WORKING_HOURS = 100;

	public Employee computeMonthlyWage() {

		Random random = new Random();
		int totalWage = 0;
		int totalHours = 0;
		int totalDays = 0;

		while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {

			totalDays++;

			int empCheck = random.nextInt(3);
			int workingHours;

			switch (empCheck) {

			case 1:
				workingHours = FULL_TIME_HOURS;
				break;

			case 2:
				workingHours = PART_TIME_HOURS;
				break;

			default:
				workingHours = 0;
			}

			totalHours += workingHours;

			int dailyWage = workingHours * WAGE_PER_HOUR;
			totalWage += dailyWage;

			System.out.println("Day " + totalDays + " | Hours: " + workingHours + " | Daily Wage: " + dailyWage);
		}

		Employee employee = new Employee();
		employee.setTotalWage(totalWage);

		System.out.println("----------------------------------");
		System.out.println("Total Working Days: " + totalDays);
		System.out.println("Total Working Hours: " + totalHours);

		return employee;
	}
}
