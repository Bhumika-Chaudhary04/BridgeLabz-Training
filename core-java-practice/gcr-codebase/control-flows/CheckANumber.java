package control_flows;
import java.util.*;
public class CheckANumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number=sc.nextInt(); //user input
		if(number>0) {
			System.out.print("Positive");
		}
		else if(number<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		
	}
	
}
