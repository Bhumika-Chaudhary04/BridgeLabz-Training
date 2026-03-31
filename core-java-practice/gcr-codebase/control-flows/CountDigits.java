package control_flows;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp=number;
        //Initialize count
        int count = 0;

        // Special case: if number is 0
        if (number == 0) {
            count = 1;
        } else {

            //Loop until number becomes 0
            while (temp!=0) {

            	//Increase count
                count++;
                //Remove last digit
                temp=temp/10;
            }
        }

        //output
        System.out.println("Number of digits in "+ number +" are "+ count);

        sc.close();
    }
}
