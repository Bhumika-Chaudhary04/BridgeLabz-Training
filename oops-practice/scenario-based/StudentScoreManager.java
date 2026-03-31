package scenario_based;
import java.util.Scanner;
public class StudentScoreManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        // Input number of students with validation
        while (true) {
            System.out.print("Enter number of students: ");
            try {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Number of students must be greater than zero.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // clear invalid input
            }
        }
        int[] scores = new int[n];
        int sum = 0;
        // Input scores with validation
        for (int i = 0; i < n; i++) {
            while (true) {
                System.out.print("Enter score for student " + (i + 1) + ": ");
                try {
                    int score = sc.nextInt();
                    if (score < 0) {
                        System.out.println("Score cannot be negative.");
                    } else {
                        scores[i] = score;
                        sum += score;
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input. Enter numeric value.");
                    sc.next(); // clear invalid input
                }
            }
        }
        // Calculate average
        double average = (double) sum / n;
        // Find highest and lowest
        int highest = scores[0];
        int lowest = scores[0];
        for (int score : scores) {
            if (score > highest)
                highest = score;
            if (score < lowest)
                lowest = score;
        }
        // Display results
        System.out.println("\n--- Student Score Analysis ---");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        // Scores above average
        System.out.print("Scores above average: ");
        boolean found = false;
        for (int score : scores) {
            if (score > average) {
                System.out.print(score + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        sc.close();
    }
}
