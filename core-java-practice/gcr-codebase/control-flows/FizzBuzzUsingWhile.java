package control_flows;
import java.util.*;
public class FizzBuzzUsingWhile {
	public static void main(String[] args) {
		//create a scnner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
        //input
		int n=sc.nextInt();
		//checking for positive integer
		if(n<0) {
			System.out.println("Not a positive integer");
			return;
		}
		//for loop to check numbers from 1 to n
		int i=1;
		while(i<=n){
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			i++;
		}
	}

}
