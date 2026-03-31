package extras;
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //user input
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        System.out.print("Convert to (C/F): ");
        char choice = sc.next().charAt(0);
        //function call and output
        if (choice=='C')
            System.out.println("Celsius: " + fahrenheitToCelsius(temp));
        else
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(temp));
    }
    //method to convert temperature from fahrenheitToCelsius
    public static double fahrenheitToCelsius(double f) {
        return (f-32)*5/9;
    }
    //method to convert temperature from celsiusToFahrenheit
    static double celsiusToFahrenheit(double c) {
        return (c*9/5)+32;
    }
}
