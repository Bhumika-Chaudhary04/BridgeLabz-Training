import java.util.*;
public class swap_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // take input from user
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();

        // swapping using third variable
        System.out.println("Before swapping a is " + a + "and b is "+ b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After swapping a is " + a + "and b is "+ b);
    }
    
}
