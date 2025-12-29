package extras;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Choose operation (+ - * /): ");
        char op = sc.next().charAt(0);
        //function call and output
        switch (op) {
            case '+': System.out.println(add(a, b)); break;
            case '-': System.out.println(subtract(a, b)); break;
            case '*': System.out.println(multiply(a, b)); break;
            case '/': System.out.println(divide(a, b)); break;
            default: System.out.println("Invalid Operation");
        }
    }
    //functions for arithmetic operations
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return b != 0 ? a / b : 0; }
}
