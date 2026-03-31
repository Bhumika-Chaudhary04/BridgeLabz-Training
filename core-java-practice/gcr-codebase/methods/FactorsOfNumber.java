package methods;
import java.util.*;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number=sc.nextInt();
        int[] factors = findFactors(number);
        System.out.println("Factors of the number : " + Arrays.toString(factors));
        System.out.println("Greatest factor : " + greatestFactor(factors));
        System.out.println("Sum of factors : " + sumOfFactors(factors));
        System.out.println("Product of factors : " + productOfFactors(factors));
        System.out.println("Product of cube of factors : " + productOfCubeOfFactors(factors));
    }

    // Method to find factors and return array
    public static int[] findFactors(int number) {
        int count=0;
        for (int i=1;i<=number;i++) {
            if (number%i==0) {
                count++;
            }
        }
        // create array
        int[] factors = new int[count];
        int index=0;
        for (int i=1;i<=number;i++) {
            if (number%i==0) {
                factors[index++]=i;
            }
        }
        return factors;
    }

    // Method to find greatest factor
    public static int greatestFactor(int[] factors) {
        int max=factors[0];
        for (int f:factors) {
            if (f>max) {
                max=f;
            }
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum=0;
        for (int f:factors) {
            sum+=f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product=1;
        for (int f:factors) {
            product*=f;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static double productOfCubeOfFactors(int[] factors) {
        double product=1;
        for (int f:factors) {
            product*=Math.pow(f,3);
        }
        return product;
    }
}
