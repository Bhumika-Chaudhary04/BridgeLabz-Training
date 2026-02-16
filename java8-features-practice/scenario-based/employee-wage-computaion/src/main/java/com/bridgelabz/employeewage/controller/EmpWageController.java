package com.bridgelabz.employeewage.controller;

import com.bridgelabz.employeewage.model.Employee;
import com.bridgelabz.employeewage.service.EmpWageService;

public class EmpWageController {

    private EmpWageService service;

    public EmpWageController() {
        service = new EmpWageService();
    }
    public void computeDailyWage() {

        Employee employee = service.computeDailyWage();

        switch (employee.getAttendance()) {

        case 1:
            System.out.println("Employee is Full Time");
            break;

        case 2:
            System.out.println("Employee is Part Time");
            break;

        default:
            System.out.println("Employee is Absent");
    }

        System.out.println("Working Hours: " + employee.getWorkingHours());
        System.out.println("Daily Wage: " + employee.getDailyWage());
    }
}
