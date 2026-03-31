package methods;
import java.util.*;
public class SimpleInterest {
	public static void main(String[] args) {
		//scanenr object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter principal amount : ");
		double principal=sc.nextDouble();
		System.out.print("Enter value of rate : ");
		double rate=sc.nextDouble();
		System.out.print("Enter duration : ");
		double time=sc.nextDouble();
		//function call
		double SI=simpleInterest(principal,rate,time);
		//output
		System.out.println("The Simple Interest is : "+SI +" for Principal "+principal +", Rate of Interest "+rate+" and Time "+time);
		
	}
	//function to calculate simple interest
	public static double simpleInterest(double principal,double rate,double time) {
		double simpleInterestValue=principal*rate*time;
		return simpleInterestValue;		
	}

}
