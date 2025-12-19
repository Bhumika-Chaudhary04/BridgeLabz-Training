package control_flows;
import java.util.*;
public class FactorsOfANumberUsingWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt(); //input
		if(n<=0) {
			System.out.println("It is not a positive number");
			return;
		}
		int i=1;
		while(i<n) {
			//check if factor
			if(n%i==0) {
				System.out.println(i);
			}
			i++;
		}
		sc.close();
		
		
		
		
	}

}
