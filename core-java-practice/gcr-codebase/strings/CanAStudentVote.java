package strings;
import java.util.*;
public class CanAStudentVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        int[]ages=generateAges(n);
        String[][] result = checkVotingEligibility(ages);
        displayResult(result);
        sc.close();
    }

    // Method to generate random 2-digit ages
    public static int[] generateAges(int n) {
        int[] ages=new int[n];
        Random r=new Random();
        for (int i=0;i<n;i++) {
            ages[i]=r.nextInt(90)+10; // random 2-digit age (10–99)
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] data = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);
            if (ages[i]<0) {
                data[i][1]="false";
            } else if (ages[i]>=18) {
                data[i][1]="true";
            } else {
                data[i][1]="false";
            }
        }
        return data;
    }

    // Method to display data in tabular format
    public static void displayResult(String[][] data) {
        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i=0;i<data.length;i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}
