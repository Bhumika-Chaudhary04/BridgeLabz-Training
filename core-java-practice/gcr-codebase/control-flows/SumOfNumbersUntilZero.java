package control_flows;
import java.util.*;
public class SumOfNumbersUntilZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total=0.0;		
		System.out.print("Enter a value : "); //input
		double input=sc.nextDouble();
		//add value to total until user enters 0 as the value
		while(input!=0) {
			total+=input;
			System.out.print("Enter a value : "); //input
			input=sc.nextDouble();
		}
		System.out.println("Total sum of the user entered value is "+total);
		
	}

}
