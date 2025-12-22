package strings;
import java.util.*;
public class GradeNPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] pcmScores = generatePCMScores(n);
        double[][] result = calculateTotalAveragePercentage(pcmScores);
        String[] grades = calculateGrades(result);
        displayScoreCard(pcmScores, result, grades);
        sc.close();
    }

    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int n) {
        int[][] scores=new int[n][3];
        Random r = new Random();
        for (int i=0;i<n;i++) {
            scores[i][0]=r.nextInt(90)+10; // Physics
            scores[i][1]=r.nextInt(90)+10; // Chemistry
            scores[i][2]=r.nextInt(90)+10; // Maths
        }
        return scores;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        double[][] result=new double[scores.length][3];
        for (int i=0;i<scores.length;i++) {
            int total=scores[i][0]+scores[i][1]+scores[i][2];
            double avg=total/3.0;
            double percent=(total/300.0)*100;
            result[i][0]=total;
            result[i][1]=Math.round(avg*100.0)/100.0;
            result[i][2]=Math.round(percent*100.0)/100.0;
        }
        return result;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] result) {
        String[] grades = new String[result.length];
        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];
            if (percent >= 90)
                grades[i] = "A+";
            else if (percent >= 80)
                grades[i] = "A";
            else if (percent >= 70)
                grades[i] = "B";
            else if (percent >= 60)
                grades[i] = "C";
            else if (percent >= 50)
                grades[i] = "D";
            else
                grades[i] = "F";
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] result, String[] grades) {
        System.out.println("\nStudent Scorecard");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    (int) result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t" +
                    grades[i]);
        }
    }
}
