package control_flows;
import java.util.Scanner;

public class ArmStrongNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize variables
        int originalNumber=number;
        int sum = 0;

        // Step 3: Use while loop until originalNumber becomes 0
        while (originalNumber!=0) {

            // Step 4: Get last digit using modulus
            int digit=originalNumber % 10;

            // Step 5: Find cube of the digit and add to sum
            sum+=digit*digit*digit;

            // Step 6: Remove last digit using division
            originalNumber = originalNumber / 10;
        }

        // Step 7: Check Armstrong condition
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        sc.close();
    }
}

