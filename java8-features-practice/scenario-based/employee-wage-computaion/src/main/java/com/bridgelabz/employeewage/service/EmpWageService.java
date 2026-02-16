package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.Employee;
import java.util.Random;

public class EmpWageService {
	private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOURS = 8;

    public Employee computeDailyWage() {

        Random random = new Random();
        int attendance = random.nextInt(2);
        Employee employee = new Employee(attendance);

        if (attendance == 1) {

            employee.setWorkingHours(FULL_DAY_HOURS);

            int wage = FULL_DAY_HOURS * WAGE_PER_HOUR;
            employee.setDailyWage(wage);

        } else {

            employee.setWorkingHours(0);
            employee.setDailyWage(0);
        }

        return employee;
    }
}
