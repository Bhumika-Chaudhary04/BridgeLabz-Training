package scenario_based;
class MathUtility {
    // factorial of a number
    public static long factorial(int number) {
        if (number < 0) {
            System.out.println("❌ Factorial not defined for negative numbers.");
            return -1;
        }
        long factorialResult = 1;
        for (int counter = 2; counter <= number; counter++) {
            factorialResult *= counter;
        }
        return factorialResult;
    }
    // check if number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int counter = 2; counter <= Math.sqrt(number); counter++) {
            if (number % counter == 0) return false;
        }
        return true;
    }
    // greatest common divisor
    public static int gcd(int firstNumber, int secondNumber) {
        if (firstNumber == 0) return secondNumber;
        if (secondNumber == 0) return firstNumber;
        return gcd(secondNumber % firstNumber, firstNumber);
    }
    // nth Fibonacci number
    public static int fibonacci(int number) {
        if (number < 0) {
            System.out.println("Fibonacci not defined for negative numbers.");
            return -1;
        }
        if (number == 0) return 0;
        if (number == 1) return 1;
        int first = 0, second = 1, next = 0;
        for (int counter = 2; counter <= number; counter++) {
            next = first + second;
            first = second;
            second = next;
        }
        return next;
    }
    // test cases
    public static void main(String[] arguments) {
        System.out.println("Factorial(5) = " + factorial(5));
        System.out.println("Factorial(-3) = " + factorial(-3));
        System.out.println("Is 7 Prime? " + isPrime(7));
        System.out.println("Is 1 Prime? " + isPrime(1));
        System.out.println("GCD(36, 24) = " + gcd(36, 24));
        System.out.println("Fibonacci(8) = " + fibonacci(8));
        System.out.println("Fibonacci(-2) = " + fibonacci(-2));
    }
}
