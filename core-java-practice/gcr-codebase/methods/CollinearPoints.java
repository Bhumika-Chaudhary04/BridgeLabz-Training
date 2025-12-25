package methods;
import java.util.*;
public class CollinearPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        // method calls
        boolean slopeCheck = isCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areaCheck = isCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        // output
        System.out.println("\nUsing Slope Formula : " + slopeCheck);
        System.out.println("Using Area Formula  : " + areaCheck);
    }
    // Method using slope formula
    public static boolean isCollinearUsingSlope(
        int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }
    // Method using area of triangle formula
    public static boolean isCollinearUsingArea(
        int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3)+ x2 * (y3 - y1)+ x3 * (y1 - y2);
        return area == 0;
    }
}
