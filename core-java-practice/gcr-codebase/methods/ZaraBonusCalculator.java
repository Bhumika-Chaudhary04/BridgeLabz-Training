package methods;
import java.util.*;
public class ZaraBonusCalculator {
    public static void main(String[] args) {
        //Generate salary and years of service
        int[][] empData=generateEmployeeData();
        //Calculate bonus and new salary
        double[][] updatedData=calculateBonus(empData);
        //Display results and totals
        displaySalaryDetails(empData, updatedData);
    }
    // Method to generate salary and years of service
    public static int[][] generateEmployeeData() {
        int[][] data=new int[10][2];
        for (int i=0;i<10;i++) {
            // 5-digit salary (10000–99999)
            data[i][0]=(int)(Math.random() * 90000) + 10000;
            // Years of service (1–10)
            data[i][1] = (int)(Math.random() * 10) + 1;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] empData) {
        double[][] result = new double[10][2];
        for (int i=0;i<10;i++) {
            int salary=empData[i][0];
            int years=empData[i][1];
            double bonus;
            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            result[i][0] = bonus;              // bonus
            result[i][1] = salary + bonus;     // new salary
        }
        return result;
    }
    // Method to display details and totals
    public static void displaySalaryDetails(int[][] empData, double[][] updatedData) {
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;
        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            int oldSalary = empData[i][0];
            int years = empData[i][1];
            double bonus = updatedData[i][0];
            double newSalary = updatedData[i][1];
            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%.2f\n",(i + 1), oldSalary, years, bonus, newSalary);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("TOTAL\t%.2f\t\t%.2f\t%.2f\n",totalOldSalary, totalBonus, totalNewSalary);
        System.out.println("-------------------------------------------------------------");
    }
}
