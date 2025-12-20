package arrays;
import java.util.Scanner;

public class ZaraEmployeeBonus {
    public static void main(String[] args) {
    	//scanner object
        Scanner sc = new Scanner(System.in);
        // Number of employees
        int numberOfEmployees = 10;
        // Arrays to store salary and years of service
        double[] salary=new double[numberOfEmployees];
        double[] yearsOfService=new double[numberOfEmployees];
        // Arrays to store bonus amount and new salary
        double[] bonusAmount=new double[numberOfEmployees];
        double[] newSalary=new double[numberOfEmployees];
        // Variables to store totals
        double totalBonus=0;
        double totalOldSalary=0;
        double totalNewSalary=0;

        //logic
        for (int i=0;i<numberOfEmployees;i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter salary: ");
            double inputSalary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double inputYears = sc.nextDouble();
            // Validate input
            if (inputSalary<=0 || inputYears<0) {
                System.out.println("Invalid input! Please enter valid salary and years of service.");
                i--; // decrement index to re-enter data for same employee
                continue;
            }
            salary[i] = inputSalary;
            yearsOfService[i] = inputYears;
        }

        // Loop to calculate bonus and new salary
        for (int i=0;i<numberOfEmployees;i++) {

            // Bonus calculation based on years of service
            if (yearsOfService[i]>5) {
                bonusAmount[i]=salary[i]*0.05; // 5% bonus
            } else {
                bonusAmount[i]=salary[i]*0.02; // 2% bonus
            }

            // Calculate new salary
            newSalary[i]=salary[i]+bonusAmount[i];

            // Calculate totals
            totalBonus+=bonusAmount[i];
            totalOldSalary+=salary[i];
            totalNewSalary+=newSalary[i];
        }

        //output
        System.out.printf("Total Old Salary: %.2f \n",totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f \n",totalBonus);
        System.out.printf("Total New Salary: %.2f \n",totalNewSalary);

        // Closing scanner
        sc.close();
    }
}
