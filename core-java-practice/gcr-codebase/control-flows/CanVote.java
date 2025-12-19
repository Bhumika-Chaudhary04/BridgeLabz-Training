package control_flows;
import java.util.*;
public class CanVote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age=sc.nextInt();  //taking input from user
		if(age>=18) {
			System.out.println("The person's age is "+age+" and can vote.");
		}
		else {
			System.out.println("The person's age is "+age+" and cannot vote.");
		}
		
	}

}
