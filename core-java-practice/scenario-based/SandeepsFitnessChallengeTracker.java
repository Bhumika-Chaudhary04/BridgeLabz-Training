package scenario_based;
import java.util.Scanner;
public class SandeepsFitnessChallengeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array to store number of push-ups done each day of the week
        int[] pushUps=new int[7];
        // Taking input for 7 days
        System.out.println("Enter push-ups for 7 days (enter 0 for rest day):");
        for (int i=0;i<pushUps.length;i++) {
            System.out.print("Day "+(i + 1) + ": ");
            pushUps[i] = sc.nextInt();
        }
        int total = 0;
        int activeDays = 0;
        for (int count:pushUps) {
            // If it is a rest day, skip the current iteration
            if (count == 0) {
                continue;
            }
            // Add push-ups to total
            total += count;
            // Count only active workout days
            activeDays++;
        }
        // Calculate average push-ups per active day
        double average=(double)total/activeDays;
        // Display the results
        System.out.println("\n-------------Weekly Report----------");
        System.out.println("Total Push-ups count in a week: " + total);
        System.out.printf("Average Push-ups per active day: %.2f",average);
    }
}
