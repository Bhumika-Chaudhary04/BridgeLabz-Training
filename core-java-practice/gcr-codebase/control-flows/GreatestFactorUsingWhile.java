package control_flows;
import java.util.*;
public class GreatestFactorUsingWhile{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt(); //input
		int greatestFactor=1;
		int i=n-1;
		while(i>=1) {
			if(n%i==0) {
				greatestFactor=i;
				break;
		    }
			i--;
		}
		System.out.print("Greatest factor of "+n+" is "+ greatestFactor);

	}

}
