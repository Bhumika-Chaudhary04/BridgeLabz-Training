package exceptions;
import java.util.*;
public class MultipleCatchBlock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter array index : ");
		int index=sc.nextInt();
		try {
			int value=arr[index];
			System.out.println("Value at the index "+index+" is "+value);
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer exception "+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of bounds exception : "+e.getMessage());
		}
		
	}
	
}
