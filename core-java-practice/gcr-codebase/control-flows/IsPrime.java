package control_flows;
import java.util.Scanner;

public class IsPrime{
    public static void main(String[] args) {
    	
    	//Scanner object
        Scanner sc=new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number=sc.nextInt();

        boolean isPrime=true;

        // Prime numbers are greater than 1
        if (number<=1) {
            isPrime=false;
        }
        else{

            // Check divisibility from 2 to number-1
            for (int i=2;i<=number-1;i++) {
                if (number%i==0) {
                    isPrime=false;
                    break;  // not prime
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        sc.close();
    }
}
