package control_flows;
import java.util.*;
public class YoungestFriend {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		
		//input
		System.out.print("Enter Amar's age : ");
		int amarAge=sc.nextInt();
		System.out.print("Enter Akbar's age : ");
		int akbarAge=sc.nextInt();
		System.out.print("Enter Anthony's age : ");
		int anthonyAge=sc.nextInt();
		System.out.print("Enter Amar's height: ");
		int amarHeight=sc.nextInt();
		System.out.print("Enter Akbar's height : ");
		int akbarHeight=sc.nextInt();
		System.out.print("Enter Anthony's height : ");
		int anthonyHeight=sc.nextInt();
		
		//find yongest friend
		if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }
		
		// find tallest friend
		if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
		
		
		sc.close();
		
		
		
	}

}
