package methods;
import java.util.*;
public class PositiveNegativeOrZero {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		//function call
		int result=checkNumber(n);
		//output
		if(result==-1)
		    System.out.println("The given number is Negative");
		else if(result==1)
			System.out.println("The guven number is Positive");
		else
			System.out.println("Given number is zero.");
		
	}
    //method to check number	
	public static int checkNumber(int n) {
		if(n<0) {
			return -1; 
		}
		else if(n>0) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
