package control_flows;
import java.util.*;
public class FactorialUsingFor{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt(); //user input
		if(n<=0) {
			System.out.println("It is not a positive number");
			return;
		}
		int factorial=1;
		//calculatig factorial using while loop
		for(int i=1;i<=n;i++) {
			factorial*=i;
		}
		//output
		System.out.println(factorial);
		
	}

}
