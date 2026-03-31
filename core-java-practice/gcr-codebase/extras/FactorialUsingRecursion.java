package extras;
import java.util.Scanner;
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        //function call and output
        System.out.println("Factorial: " + factorial(n));
    }
    //recursive function to find factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
