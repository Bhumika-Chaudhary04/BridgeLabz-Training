package control_flows;
import java.util.*;
public class IsDivisibleByFive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        //input
		System.out.print("Enter number ");
		int number=sc.nextInt();
        //output		
		boolean isDivisible=number%5==0;
		System.out.println("Is the number "+number+" divisible by 5? "+isDivisible);
	}

}
