package methods;
import java.util.*;
public class MaximumNumberOfHandshakes {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter numebr of students : ");
		int n=sc.nextInt();
		//function call
		int result=numberOfHandshakes(n);
		System.out.println("Possible numebr of handshakes are : "+result);
	}
	//methods to calculate maximum number of handshakes
	public static int numberOfHandshakes(int n) {
		//combination formula is used for calculation
		int handshakes=n*(n-1)/2;
		return handshakes;
	}

}
