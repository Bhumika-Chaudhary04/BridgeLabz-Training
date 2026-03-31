package arrays;
import java.util.Scanner;
public class StudentGradeTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        int[][] marks = new int[numberOfStudents][3];
        // Arrays to store percentage and grade
        double[] percentage = new double[numberOfStudents];
        char[] grade = new char[numberOfStudents];
        // Input marks with validation
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject =(j == 0) ? "Physics" :(j == 1) ? "Chemistry" : "Maths";
                System.out.print("Enter marks for " + subject + ": ");
                int value = sc.nextInt();
                // Validate marks
                if (value < 0) {
                    System.out.println("Invalid marks! Please enter positive values.");
                    j--; // re-enter same subject marks
                } else {
                    marks[i][j] = value;
                }
            }
        }

        // Calculate percentage and grade using 2D array
        for (int i = 0; i < numberOfStudents; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentage[i] = total / 3.0;
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        //output
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c%n",marks[i][0],marks[i][1],marks[i][2],percentage[i],grade[i]);
        }

        sc.close();
    }
}
