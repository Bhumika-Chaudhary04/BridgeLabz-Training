import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

    // Method to check if number is happy
    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {

            // If number repeats → cycle detected
            if (seen.contains(n)) {
                return false;
            }

            seen.add(n);

            int sum = 0;

            // Calculate sum of squares of digits
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            n = sum;
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean result = isHappy(number);

        if (result) {
            System.out.println(number + " is a Happy Number");
        } else {
            System.out.println(number + " is NOT a Happy Number");
        }

        sc.close();
    }
}