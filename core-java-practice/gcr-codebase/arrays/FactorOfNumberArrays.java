package arrays;
import java.util.Scanner;

public class FactorOfNumberArrays {
    public static void main(String[] args) {

        // Scanner object
        Scanner sc=new Scanner(System.in);

        // Taking input number
        System.out.print("Enter a number: ");
        int number=sc.nextInt();

        // Initial maximum size for factors array
        int maxFactor=10;
        int[] factors=new int[maxFactor];
        int index=0;

        // Loop from 1 to the number to find factors
        for (int i=1;i<=number;i++) {
            // Check if i is a factor of the number
            if (number%i==0) {
                // If array is full, increase its size
                if (index==maxFactor) {
                    // Double the size of the array
                    maxFactor=maxFactor*2;
                    // Temporary array with increased size
                    int[] temp=new int[maxFactor];
                    // Copy old factors into new array
                    for (int j=0;j<index;j++) {
                        temp[j]=factors[j];
                    }

                    // Assign new array to factors
                    factors=temp;
                }

                // Store factor in array
                factors[index] =i;
                index++;
            }
        }

        // Displaying the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        // Closing scanner
        sc.close();
    }
}
