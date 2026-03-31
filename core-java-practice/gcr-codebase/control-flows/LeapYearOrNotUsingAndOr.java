package control_flows;
import java.util.*;
public class LeapYearOrNotUsingAndOr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year: ");
		int year=sc.nextInt(); //input
		// Check for Gregorian calendar
        if (year<1582) {
            System.out.println("Year should be greater than or equal to 1582");
            return;
        }
        
        //condition check and output
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year+" is a Leap Year");
        } else {
            System.out.println(year+" is not a Leap Year");
        }

        sc.close();
		
		
	}

}
