import java.util.*;
public record power() {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //take input from user
        System.out.println("Enter base");
        double base = sc.nextDouble();
        System.out.println("Enter exponent");
        double e=sc.nextDouble();

        // calculate power
        double p=Math.pow(base,e);
        System.out.println("Power is" +p);
    }
    
}
