import java.util.*;
public class simple_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // take input from user
        System.out.println("Enter Principal");
        double p=sc.nextDouble();

        System.out.println("Enter Rate");
        double r=sc.nextDouble();

        System.out.println("Enter Time");
        double t=sc.nextDouble();

        // calculating simple interest
        double si=(p*r*t)/100;
        System.out.println("Simple Interest is" + si);
    }
    
}

