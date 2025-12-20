package arrays;
import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
    	//scanner object to take user inputs
        Scanner sc=new Scanner(System.in);
        // Take number input from user
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        // Maximum digits allowed
        int maxDigit = 10;
        int[] digits=new int[maxDigit];
        int index=0;
        //Extract digits from the number and store in array
        while (number!=0 && index<maxDigit) {
            digits[index]=number%10; // get last digit
            number=number/10;        // remove last digit
            index++;
        }

        // Variables to store largest and second largest digit
        int largest = 0;
        int secondLargest = 0;

        // Loop through the stored digits
        for (int i=0;i<index;i++) {
            if (digits[i]>largest) {
                secondLargest=largest;
                largest=digits[i];
            }
            else if (digits[i]>secondLargest && digits[i]!=largest) {
                secondLargest = digits[i];
            }
        }

        //output
        System.out.println("Largest Digit: "+largest);
        System.out.println("Second Largest Digit: "+secondLargest);

        // Close scanner
        sc.close();
    }
}
