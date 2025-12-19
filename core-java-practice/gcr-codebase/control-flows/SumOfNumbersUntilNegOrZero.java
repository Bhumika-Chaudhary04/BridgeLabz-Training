package control_flows;
import java.util.*;
public class SumOfNumbersUntilNegOrZero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double total=0.0;
		double value=0;
		while(true) {
			System.out.print("Enter a value : ");
			value=sc.nextDouble(); //user input
			if(value<=0) { //condition check
				break;
			}
			total+=value;
		}
		System.out.println(total);
	}

}
