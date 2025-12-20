package arrays;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take input number
        System.out.print("Enter a number: ");
        int number=sc.nextInt();
        int temp=number;
        int count=0;
        //Find count of digits
        while (temp>0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = number;
        for (int i=count-1;i>=0;i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }
        //Display frequency
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
        sc.close();
    }
}
