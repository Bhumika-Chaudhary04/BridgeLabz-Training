package com.bridgelabz.employeewage.service;

import com.bridgelabz.employeewage.model.Employee;
import java.util.Random;

public class EmpWageService {

    public Employee checkAttendance() {

        Random random = new Random();
        int attendance = random.nextInt(2);

        return new Employee(attendance);
    }
}
