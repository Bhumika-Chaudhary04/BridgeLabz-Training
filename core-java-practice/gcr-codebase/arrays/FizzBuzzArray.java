package arrays;
import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {

        // Scanner object
        Scanner sc = new Scanner(System.in);

        //input number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if input is a positive integer
        if (number<=0) {
            System.out.println("Error: Please enter a positive integer.");
            sc.close();
            return; // exit program
        }

        // Creating String array to store FizzBuzz results
        String[] results=new String[number+1];

        // Loop from 1 to the given number
        for (int i=1;i<=number;i++) {
            // Check multiples of both 3 and 5
            if (i%3==0 && i%5==0) {
                results[i]="FizzBuzz";
            }
            // Check multiples of 3
            else if (i%3==0) {
                results[i]="Fizz";
            }
            // Check multiples of 5
            else if (i%5==0) {
                results[i]="Buzz";
            }
            // Otherwise store the number itself
            else {
                results[i]=String.valueOf(i);
            }
        }

        // Displaying the results from the array
        for (int i=1;i<=number;i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Closing scanner
        sc.close();
    }
}
