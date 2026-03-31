package methods;
import java.util.*;
public class SpringSeason {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter month[1-12] : ");
		int month=sc.nextInt();
		System.out.print("Enter date[1-31]: ");
		int day=sc.nextInt();
		//function call
		isSpring(month,day);
		
	}
	//function to check if its a spring season or not
	public static void isSpring(int month,int day) {
		if((month==3 && day>=20) || month==4 || month==5 ||(month==6 && day<=20)) {
			System.out.println("Its a Spring Season");
			return;
		}
		System.out.println("Not a Spring Season");
		
	}

}
