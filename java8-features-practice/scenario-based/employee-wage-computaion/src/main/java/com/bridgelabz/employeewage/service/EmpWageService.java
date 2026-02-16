package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.Employee;
import java.util.Random;

public class EmpWageService {
	// Class Variables (NOT static final now)
	private int wagePerHour;
	private int maxWorkingDays;
	private int maxWorkingHours;

	private static final int FULL_TIME_HOURS = 8;
	private static final int PART_TIME_HOURS = 4;

	// Constructor
	public EmpWageService(int wagePerHour, int maxWorkingDays, int maxWorkingHours) {

		this.wagePerHour = wagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
	}

	// Class Method
	public Employee computeEmployeeWage() {

		Random random = new Random();

		int totalWage = 0;
		int totalHours = 0;
		int totalDays = 0;

		while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {

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

			int dailyWage = workingHours * wagePerHour;
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
