package scenario_based;
import java.util.Scanner;

public class MayasBMIFitnessTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter height in m: ");
        double heightInMeters = sc.nextDouble();
        System.out.print("Enter weight in kg: ");
        double weightInKg = sc.nextDouble();

        //Calculate BMI
        //BMI=weight/(height*height)
        double bmi=weightInKg/(heightInMeters*heightInMeters);
        String category;

        //find BMI status using if-else statement
        if (bmi<=18.4) {
            category="Underweight";
        } else if (bmi>18.4 && bmi<25) {
            category="Normal";
        } else {
            category="Overweight";
        }
        
        //output
        System.out.printf("Your BMI is %.2f",bmi);
        System.out.println();
        System.out.println("Status : " + category);
        
        //closing scanner
        sc.close();
    }
}

