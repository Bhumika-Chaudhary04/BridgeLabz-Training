package arrays;
import java.util.*;
public class SumArray {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		double[] arr=new double[10];
		double total=0.0;
		int i=0;
		//logic
		while(true) {
			if(i>=10) {
				break;
			}
			System.out.print("Enter a value : ");
			double number=sc.nextDouble();
			if(number<=0) {
				System.out.println("User entered value is negative or zero");
				break;
			}
			arr[i++]=number;
			
			
		}
		for(int j=0;j<arr.length;j++) {
			total+=arr[j];
		}
		System.out.println("Sum of the array is "+total);
		
		
	}

}
