package methods;
import java.util.*;
public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year : ");
		int year=sc.nextInt();
		if(year<1582) {
			System.out.println("Leap Year calculation is valid only for year >= 1582");
		}
		boolean result=isLeapYear(year);
		System.out.println(year+" is a leap year ? "+result);
		
	}
	//function to check leap year or not
	public static boolean isLeapYear(int year) {
		if(year%400==0 || (year%4==0 && year%100!=0)) {
			return true;
		}
		return false;
	}

}
