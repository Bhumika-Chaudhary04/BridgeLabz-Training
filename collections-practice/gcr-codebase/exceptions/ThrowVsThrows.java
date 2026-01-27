package exceptions;
import java.util.*;
public class ThrowVsThrows {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount : ");
		double amount=sc.nextDouble();
		System.out.print("Enter rate : ");
		double rate=sc.nextDouble();
		System.out.print("Enter year : ");
		int years=sc.nextInt();
		try {
			double ans=calculateInterest(amount,rate,years);
			System.out.println("Interest is : "+ans);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	public static double calculateInterest(double amount,double rate,int years) throws IllegalArgumentException{
		if(amount<0 || rate<0) {
			throw new IllegalArgumentException("Invalid input : Amount and rate must be positive.");
		}
		return amount*rate*years/100;
	}
}
