import java.util.*;
public class Celsius_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // take user input
        System.out.println("Enter temperature in Celsius ");
        double celsius=sc.nextDouble();

        // converting celcius to fahrenheit
        double fahrenheit=(celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit is " + fahrenheit);
    }
}
