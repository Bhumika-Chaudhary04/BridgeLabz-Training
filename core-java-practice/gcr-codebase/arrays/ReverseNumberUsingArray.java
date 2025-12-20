package arrays;
import java.util.Scanner;

public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take number input from user
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        //Store original number for reuse
        int tempNumber=number;
        //Find count of digits
        int digitCount=0;
        while (tempNumber!=0) {
            digitCount++;
            tempNumber=tempNumber/10;
        }
        // Create array to store digits
        int[] digits = new int[digitCount];
        tempNumber=number;
        for (int i=digitCount-1;i>=0;i--) {
            digits[i]=tempNumber%10;
            tempNumber=tempNumber/10;
        }

        //array to store reversed digits
        int[] reversedDigits=new int[digitCount];

        //Store digits in reverse order
        for (int i=0; i<digitCount;i++) {
            reversedDigits[i]=digits[digitCount-1-i];
        }
        //output
        System.out.print("Reversed Number: ");
        for (int i=0;i<digitCount;i++) {
            System.out.print(reversedDigits[i]);
        }

        sc.close();
    }
}

