package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.Employee;
import java.util.Random;

public class EmpWageService {
	private static final int WAGE_PER_HOUR = 20;
	private static final int FULL_TIME_HOURS = 8;
	private static final int PART_TIME_HOURS = 4;
	private static final int WORKING_DAYS = 20;

	public Employee computeMonthlyWage() {

		Random random = new Random();
		int totalWage = 0;

		for (int day = 1; day <= WORKING_DAYS; day++) {

			int empCheck = random.nextInt(3);

			Employee employee = new Employee(empCheck);

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

			employee.setWorkingHours(workingHours);

			int dailyWage = workingHours * WAGE_PER_HOUR;
			employee.setDailyWage(dailyWage);

			totalWage += dailyWage;

			System.out.println("Day " + day + " | Daily Wage: " + dailyWage);
		}

		Employee monthlyEmployee = new Employee();
		monthlyEmployee.setTotalWage(totalWage);

		return monthlyEmployee;
	}
}
