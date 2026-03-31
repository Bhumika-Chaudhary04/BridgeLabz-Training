package control_flows;
import java.util.*;
public class oddEvenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt(); //input
		//checking if user entered a natural number or not
		if(number<=0) {
			System.out.println("Not a natural number");
			return;
		}
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				System.out.println(i+" is an even number.");
			}
			else {
				System.out.println(i+" is a odd number.");
			}
		}
	}

}
