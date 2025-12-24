package methods;
import java.util.*;
public class SmallestNLargest {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.println("Enter three numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		//function call
		int[] ans=findSmallestAndLargest(a,b,c);
		System.out.println("Smallest Number is : "+ans[0]);
		System.out.println("Largest Number is : "+ans[1]);
		
	}
	public static int[] findSmallestAndLargest(int a,int b,int c) {
		//output arary
		int[] ans=new int[2];
		//check smallest
		if(a<b && a<c) {
			ans[0]=a;
		}
		else if(b<a && b<c) {
			ans[0]=b;
		}
		else {
			ans[0]=c;
		}
		//check largest
		if(a>b && a>c) {
			ans[1]=a;
		}
		else if(b>a && b>c) {
			ans[1]=b;
		}
		else {
			ans[1]=c;
		}
		return ans;
	}

}
