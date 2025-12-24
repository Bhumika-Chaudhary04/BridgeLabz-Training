package methods;
import java.util.*;
public class NumberOfRounds {
	public static void main(String[] args) {
		//Scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.println("Enter sides : ");
		double b=sc.nextInt();
		double a=sc.nextInt();
		double c=sc.nextInt();
		int distanceInKm=5;
		double result=numberOfRounds(a,b,c,distanceInKm);
		System.out.printf("Number of rounds user needs to do to complete 5km run : %.2f",result);	
		
	}
	public static double numberOfRounds(double a,double b,double c,int distanceInKm) {
		double perimeter=a+b+c;
		int distanceInMeters=distanceInKm*1000;
		double rounds=distanceInMeters/perimeter;
		return rounds;
	}

}
