package methods;
import java.util.*;
public class DistanceAndLineEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        // method calls
        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);
        // output
        System.out.printf("\nEuclidean Distance = %.2f\n", distance);
        if (Double.isInfinite(line[0])) {
            System.out.println("Line Equation: x = " + x1);
        } else {
            System.out.printf("Line Equation: y = %.2fx + %.2f\n", line[0], line[1]);
        }
    }

    // Method to find Euclidean distance
    public static double findDistance(double x1, double y1,double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) +Math.pow(y2 - y1, 2));
    }

    // Method to find slope and y-intercept
    public static double[] findLineEquation(double x1, double y1,double x2, double y2) {
        double[] result = new double[2];
        // vertical line case
        if (x2 == x1) {
            result[0] = Double.POSITIVE_INFINITY; // slope
            result[1] = x1;                       // x = constant
            return result;
        }
        double m=(y2 - y1) / (x2 - x1);
        double b=y1 - m * x1;
        result[0]=m;
        result[1]=b;
        return result;
    }
}
