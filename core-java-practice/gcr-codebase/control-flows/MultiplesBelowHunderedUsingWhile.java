package control_flows;
import java.util.*;
public class MultiplesBelowHunderedUsingWhile{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number=sc.nextInt(); //input
		
		//check for positive integer and less than 100
		if (number<=0 || number>=100) {
            System.out.println("Either not a positive integer or greater than 99");
            return;
        }
		
		
        System.out.println("Numbers that perfectly divide " + number + " are:");
		//for loop
        int i=100;
		while(i>=1) {
			if(number%i==0) {
				System.out.println(i);
			}
			i--;
		}
	}

}
