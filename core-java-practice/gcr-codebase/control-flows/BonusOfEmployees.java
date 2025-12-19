package control_flows;
import java.util.*;
public class BonusOfEmployees {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//input
		System.out.print("Enter salary: ");
		int salary=sc.nextInt();
		System.out.print("Enter year of service ");
		int yearOfService=sc.nextInt();
		
		//output
		if(yearOfService>=5) {
			double bonus=5*salary/100; //5 percent bonus
			System.out.println("Bonus amount is "+bonus);
		}
		else {
			System.out.println("Bonus amount is 0");
		}
		
	}

}
