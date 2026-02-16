package com.bridgelabz.employeewage.controller;

import com.bridgelabz.employeewage.model.Employee;
import com.bridgelabz.employeewage.service.EmpWageService;

public class EmpWageController {

    private EmpWageService service;

    public EmpWageController() {
        service = new EmpWageService();
    }

    public void checkAttendance() {

        Employee employee = service.checkAttendance();

        if (employee.getAttendance() == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
