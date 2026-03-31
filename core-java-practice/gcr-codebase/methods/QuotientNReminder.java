package methods;
import java.util.*;
public class QuotientNReminder {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		System.out.print("Enter divisor : ");
		int divisor=sc.nextInt();
		//function call
		int[] ans=findRemainderAndQuotient(number,divisor);
		System.out.println("Quotient : " + ans[0]);
		System.out.println("Reminder : "+ans[1]);
	}
	//function to find reminder and quotient is
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quotient=number/divisor;
		int reminder=number%divisor;
		return new int[] {quotient,reminder};
	}


}
