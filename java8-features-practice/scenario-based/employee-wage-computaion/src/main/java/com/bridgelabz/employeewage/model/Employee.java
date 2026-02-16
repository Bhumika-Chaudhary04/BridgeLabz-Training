package com.bridgelabz.employeewage.model;

public class Employee {

	private int attendance;
	private int workingHours;
    private int dailyWage;

	public Employee(int attendance) {
		this.attendance = attendance;
	}

	public int getAttendance() {
		return attendance;
	}
	public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(int dailyWage) {
        this.dailyWage = dailyWage;
    }
}
