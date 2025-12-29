package extras;
import java.util.Scanner;
public class GCDAndLCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        //function call
        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b);
        //output
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
    //function to find gcd
    public static int findGCD(int a,int b) {
        if (b==0) return a;
        return findGCD(b,a % b);
    }
    //function to find lcm
    public static int findLCM(int a, int b) {
        return (a*b)/findGCD(a, b);
    }
}
