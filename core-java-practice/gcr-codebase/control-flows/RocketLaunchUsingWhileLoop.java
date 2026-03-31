package control_flows;
import java.util.*;
public class RocketLaunchUsingWhileLoop {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 // input
	     System.out.print("Enter countdown starting number: ");
	     int counter=sc.nextInt();

	     //Countdown using while loop
	     while (counter>=1) {
	         System.out.println(counter);
	         counter--;   // decrement counter
	     }
	}

}
