package control_flows;
import java.util.*;
public class MultiplicationTableFromSixToNine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int number=sc.nextInt(); //input
		System.out.println("Multiplication table of "+number +" from six to nine is");
		for(int i=6;i<=9;i++) {
			System.out.println(number +" * " + i +" = " +number*i);
		}
		
	}

}
