package control_flows;
import java.util.Scanner;
public class PowerOfANumberUsingWhile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check for positive integers
        if (number <= 0 || power <0) {
            System.out.println("Please enter positive integers");
            return;
        }
        
        int result = 1;  // initial value

        // Calculate power
        int i=1;
        while(i<=power) {
            result*=number;
            i++;
        }

        //output
        System.out.println(number + " raised to the power " + power + " is: " + result);

        sc.close();
    }
}
