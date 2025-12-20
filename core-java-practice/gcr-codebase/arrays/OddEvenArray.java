package arrays;
import java.util.*;
public class OddEvenArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt();
		// Check for natural number
        if (number<=0) {
            System.out.println("Error:Please enter a natural number greater than 0");
            return; // exit the program
        }
        // Creating arrays for odd and even numbers
        int[] evenNumbers=new int[number/2+1];
        int[] oddNumbers=new int[number/2+1];

        // Index variables to track positions
        int evenIndex=0;
        int oddIndex=0;

        // Loop from 1 to the given number
        for (int i = 1; i <= number; i++) {
            // Check if number is even
            if (i % 2 == 0) {
                evenNumbers[evenIndex++] = i;
            }
            // Otherwise, number is odd
            else {
                oddNumbers[oddIndex++] = i;
            }
        }

        // Printing even numbers array
        System.out.println("\nEven Numbers:");
        for (int i=0;i<evenIndex;i++) {
            System.out.print(evenNumbers[i]+" ");
        }

        // Printing odd numbers array
        System.out.println("\n\nOdd Numbers:");
        for (int i=0;i<oddIndex;i++) {
            System.out.print(oddNumbers[i]+" ");
        }

        // Closing scanner
        sc.close();
        
		
		
	}

}
