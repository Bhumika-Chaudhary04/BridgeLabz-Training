package methods;
import java.util.*;
public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		//function call
		int result=sum(n);
		System.out.println("Sum of "+n+" natural numbers is : "+result);		
	}
	//user defined sum to find the sum of n natural numbers
	public static int sum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

}
