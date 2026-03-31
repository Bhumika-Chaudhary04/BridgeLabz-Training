package extras;
import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        // Check whether the number is prime using isPrime() method
        if (isPrime(num))
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }

    // Method to check whether a number is prime
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
