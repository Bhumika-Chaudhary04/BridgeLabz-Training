package control_flows;
import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        //sum of proper divisors
        for (int i=1;i<number;i++) {
            if (number%i==0) {
                sum=sum+i;
            }
        }

        //Check Abundant condition
        if (sum>number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        sc.close();
    }
}

