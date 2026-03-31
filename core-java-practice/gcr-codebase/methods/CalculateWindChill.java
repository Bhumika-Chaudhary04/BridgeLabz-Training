package methods;
import java.util.*;
public class CalculateWindChill {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter temperature : ");
		double temperature=sc.nextDouble();
		System.out.print("Enter windSpeed : ");
		double windSpeed=sc.nextDouble();
		//function call
		double ans=calculateWindChill(temperature,windSpeed);
		System.out.printf("Wind chill temperature : %.2f",ans);
		
	}
	//function to calcualte wind chill
	public static double calculateWindChill(double temperature, double windSpeed) {
		double windChill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(windSpeed,0.16);
		return windChill;
	}

}
