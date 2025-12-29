package scenario_based;

import java.util.Random;

public class EmployeeWageComputation {
    // Constants
    static final int wagePerHour = 20;
    static final int fullDayHour = 8;
    static final int partTimeHour = 4;
    static final int maxWorkingDays = 20;
    static final int maxWorkingHours = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch\n");
    }

    // Use Case 1: Check if employee is present or absent
    public static boolean isEmployeePresent() {
        Random random = new Random();
        return random.nextInt(2) == 1;
    }

    // UC2: Get employee type (1 = Part Time, 2 = Full Time)
    public static int getEmployeeType() {
        Random random = new Random();
        return random.nextInt(2) + 1;
    }

    // UC3 & UC4: Get working hours using switch case
    public static int getWorkingHours(int employeeType) {
        int workingHours;
        switch (employeeType) {
            case 1:
                workingHours=partTimeHour;
                break;
            case 2:
                workingHours=fullDayHour;
                break;
            default:
                workingHours=0;
        }
        return workingHours;
    }

}
