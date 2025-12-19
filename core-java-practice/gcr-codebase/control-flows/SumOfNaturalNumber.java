package control_flows;
import java.util.*;
public class SumOfNaturalNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input
		System.out.print("Enter number ");
		int number=sc.nextInt();
		
		//output
		if(number>0) {
			int sum=number*(number+1)/2; //sum of positive natural number
			System.out.println("The sum of "+number +" natural numbers is "+sum);
		}
		else {
			System.out.println("The number "+number +" is not a natural number");
		}
	}

}
