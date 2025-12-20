package arrays;
import java.util.Scanner;

public class LargestSecondLargestDigitTwo {
    public static void main(String[] args) {
    	//scanenr object
        Scanner sc = new Scanner(System.in);
        // Take input
        System.out.print("Enter a number: ");
        String number=sc.next();
        int maxDigit=10;
        int[] digits = new int[maxDigit];
        int index = 0;
        // Loop
        for (int i=number.length()-1;i>=0;i--) {
            if (index==maxDigit) {
                maxDigit=maxDigit+10;
                int[] temp=new int[maxDigit];
                for (int j=0;j<index;j++) {
                    temp[j]=digits[j];
                }
                digits=temp;
            }
            digits[index]=number.charAt(i)-'0';
            index++;
        }
        int largest=0;
        int secondLargest=0;
        // Loop to find largest and second largest digit
        for (int i=0;i<index;i++) {
            if (digits[i]>largest) {
                secondLargest=largest;
                largest=digits[i];
            }
            else if (digits[i]>secondLargest && digits[i] != largest) {
                secondLargest=digits[i];
            }
        }

        // Display results
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        sc.close();
    }
}
