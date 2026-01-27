package exceptions;
import java.util.*;
public class FinallyBlock {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.print("Enter first integer : ");
			int n1=sc.nextInt();
			System.out.print("Enter second integer : ");
			int n2=sc.nextInt();
			int div=n1/n2;
			System.out.println(n1+" divided by " + n2+" is "+div);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception "+e.getMessage());
		}
		finally {
			System.out.println("Operation completed");
		}
	}
}
