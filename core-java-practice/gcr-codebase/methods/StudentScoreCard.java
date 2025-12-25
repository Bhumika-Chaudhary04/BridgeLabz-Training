package methods;
import java.util.*;
public class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        // method calls
        int[][] pcmScores = generatePCMScores(n);
        double[][] results = calculateResults(pcmScores);
        displayScoreCard(pcmScores, results);
    }
    // Method to generate random PCM scores
    public static int[][] generatePCMScores(int n) {
        int[][] scores=new int[n][3];
        for (int i=0; i<n;i++) {
            scores[i][0]=(int)(Math.random()*90)+10; // Physics
            scores[i][1]=(int)(Math.random()*90)+10; // Chemistry
            scores[i][2]=(int)(Math.random()*90)+10; // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            // rounding to 2 decimal places
            average=Math.round(average*100.0)/100.0;
            percentage=Math.round(percentage*100.0)/100.0;
            result[i][0]=total;
            result[i][1]=average;
            result[i][2]=percentage;
        }
        return result;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("\n------------------------------------------------------------");
        System.out.println("Std\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------");
        for (int i=0;i<scores.length;i++) {
            System.out.println((i + 1) + "\t" +scores[i][0] + "\t" +scores[i][1] + "\t\t" +scores[i][2] + "\t" +(int)results[i][0] + "\t" +results[i][1] + "\t" +results[i][2] + "%");
        }
        System.out.println("------------------------------------------------------------");
    }
}
