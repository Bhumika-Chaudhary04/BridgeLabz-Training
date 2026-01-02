package scenario_based;
import java.util.Scanner;
public class EduQuizGrader {
    // Method to calculate score
    public static int calculateScore(String[] correct, String[] student) {
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                score++;
            }
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalQuestions = 10;
        String[] correctAnswers = new String[totalQuestions];
        String[] studentAnswers = new String[totalQuestions];
        System.out.println("Enter Correct Answers:");
        for (int i = 0; i < totalQuestions; i++) {
            System.out.print("Correct answer for Question " + (i + 1) + ": ");
            correctAnswers[i] = sc.nextLine();
        }
        System.out.println("\nEnter Student Answers:");
        for (int i = 0; i < totalQuestions; i++) {
            System.out.print("Student answer for Question " + (i + 1) + ": ");
            studentAnswers[i] = sc.nextLine();
        }
        // Calculate score
        int score = calculateScore(correctAnswers, studentAnswers);
        // Feedback
        System.out.println("\n---- Quiz Feedback ----");
        for (int i = 0; i < totalQuestions; i++) {
            if (studentAnswers[i].equalsIgnoreCase(correctAnswers[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
        // Percentage & Result
        double percentage = (score * 100.0) / totalQuestions;
        String result = (percentage >= 50) ? "PASS" : "FAIL";
        System.out.println("\nScore: " + score + "/" + totalQuestions);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);
        sc.close();
    }
}

