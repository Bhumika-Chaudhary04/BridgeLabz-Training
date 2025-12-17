import java.util.*;
public class average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // take input from user of three numbers n1 , n2 and n3
        System.out.println("Enter first number");
        double n1=sc.nextDouble();
        System.out.println("Enter second number");
        double n2=sc.nextDouble();
        System.out.println("Enter third number");
        double n3=sc.nextDouble();

        // calculate average of three numbers
        double avg=(n1+n2+n3)/3;
        System.out.println("Average is" + avg);
    }
    
}
