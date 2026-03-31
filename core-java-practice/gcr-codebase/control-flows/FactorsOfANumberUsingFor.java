package control_flows;
import java.util.*;
public class FactorsOfANumberUsingFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt(); //input
		if(n<=0) {
			System.out.println("It is not a positive number");
			return;
		}
		for(int i=1;i<n;i++) {
			//check if factor
			if(n%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
		
		
		
		
	}

}
