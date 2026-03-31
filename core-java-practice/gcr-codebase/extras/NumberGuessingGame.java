package extras;
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    static Scanner sc=new Scanner(System.in);
    //main function
    public static void main(String[] args) {
        int low=1,high=100;
        boolean guessed = false;
        System.out.println("Think of a number between 1 and 100.");
        while (!guessed) {
            int guess=generateGuess(low,high);
            System.out.println("Computer guesses: " + guess);
            String feedback = getFeedback();
            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed correctly!");
                guessed = true;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }
    //function to generate random number
    public static int generateGuess(int low,int high) {
        return low+new Random().nextInt(high-low+1);
    }
    public static String getFeedback() {
        System.out.print("Is it high, low, or correct? ");
        return sc.next();
    }
}
