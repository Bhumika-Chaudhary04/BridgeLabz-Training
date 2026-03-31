package scenario_based;
import java.util.Scanner;
public class BusRouteDistanceTracker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double totalDistance=0.0;
        double stopDistance=2.5; // distance between each stop in km
        char choice ='n';
        System.out.println("Bus Route Distance Tracker Started");
        while (choice!='y') {
            totalDistance+=stopDistance;
            System.out.println("\nBus reached next stop.");
            System.out.println("Distance covered so far: " + totalDistance + " km");
            System.out.print("Do you want to get off the bus? (y/n): ");
            choice=sc.next().toLowerCase().charAt(0);
        }
        System.out.println("\nPassenger got off the bus.");
        System.out.println("Total distance travelled: " + totalDistance + " km");
        sc.close();
    }
}
