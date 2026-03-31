package control_flows;
import java.util.*;
public class SumOfNaturalNumbersNCompareUsingForLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number ");
		int n=sc.nextInt();
		//checking whether n is a natural number
		if(n<=0) {
			System.out.println("Not a natural number");
			return;
		}
		int sum=0;
		// finding sum using for loop
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		// directly using formula
		int totalSum=n*(n+1)/2;
		boolean compare=sum==totalSum;
		System.out.println("The total sum is "+sum +" and the values are "+compare);
		
		
	}

}
