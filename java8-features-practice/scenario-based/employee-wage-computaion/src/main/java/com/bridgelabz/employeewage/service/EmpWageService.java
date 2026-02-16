package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.Employee;
import java.util.Random;

public class EmpWageService {
	private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_TIME_HOURS = 8;
    private static final int PART_TIME_HOURS = 4;

    public Employee computeDailyWage() {

        Random random = new Random();
        int empCheck = random.nextInt(3);  // 0,1,2

        Employee employee = new Employee(empCheck);

        int workingHours = 0;

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

        int wage = workingHours * WAGE_PER_HOUR;
        employee.setDailyWage(wage);

        return employee;
    }
}
