package control_flows;
import java.util.*;
public class GreatestFactorUsingFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt(); //input
		int greatestFactor=1;
		for(int i=n-1;i>=1;i--) {
			if(n%i==0) {
				greatestFactor=i;
				break;
		    }
		}
		System.out.print("Greatest factor of "+n+" is "+ greatestFactor);

	}

}
