package extras;
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(result);
    }
    //method to get input
    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    //method to check if string is palindrome  
    public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        String reverse = new StringBuilder(clean).reverse().toString();
        return clean.equals(reverse);
    }
    //method to display result
    public static void displayResult(boolean isPalindrome) {
        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}
