import java.util.*;
public class FeetsToYardsNMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //taking user input of distance in feet
        System.out.print("Enter distance in feet ");
        double distanceInFeet=sc.nextDouble();

        // Convert to yards and miles
        double distanceInYards=distanceInFeet/3;
        double distanceInMiles=distanceInYards/1760;

        System.out.printf("Distance in yards is %.2f and in miles is %.4f",distanceInYards, distanceInMiles);
	}

}
