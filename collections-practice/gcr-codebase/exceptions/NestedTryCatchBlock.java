package exceptions;
import java.util.*;
public class NestedTryCatchBlock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter index of the array : ");
		int index=sc.nextInt();
		System.out.print("Enter divisor : ");
		int divisor=sc.nextInt();
		try {
			int value=arr[index];
			int ans=value/divisor;
			System.out.println(value+" divided by " + divisor+" is "+ans);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid array index!");
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
		}
	}
}
