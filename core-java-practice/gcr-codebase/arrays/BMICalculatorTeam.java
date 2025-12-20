package arrays;
import java.util.Scanner;

public class BMICalculatorTeam {
    public static void main(String[] args) {
    	//scanner object
        Scanner sc = new Scanner(System.in);
        // Take number of persons
        System.out.print("Enter number of persons: ");
        int numberOfPersons=sc.nextInt();

        // Arrays to store information
        double[] heights = new double[numberOfPersons]; // height in meters
        double[] weights = new double[numberOfPersons]; // weight in kg
        double[] bmiValues = new double[numberOfPersons];
        String[] bmiStatus = new String[numberOfPersons];

        // Input height and weight
        for (int i=0; i<numberOfPersons;i++) {
            System.out.println("\nPerson " +(i + 1));
            System.out.print("Enter height (in meters): ");
            heights[i] = sc.nextDouble();
            System.out.print("Enter weight (in kg): ");
            weights[i] = sc.nextDouble();
        }

        // Calculate BMI and status
        for (int i=0;i<numberOfPersons;i++) {
            bmiValues[i]=weights[i]/(heights[i]*heights[i]);
            if (bmiValues[i]<18.5) {
                bmiStatus[i]="Underweight";
            } else if (bmiValues[i]<25) {
                bmiStatus[i]="Normal";
            } else if (bmiValues[i]<30) {
                bmiStatus[i]="Overweight";
            } else {
                bmiStatus[i]="Obese";
            }
        }

        //output
        System.out.println("Height(m)\tWeight(kg)\tBMI\t\tStatus");

        for (int i=0;i<numberOfPersons;i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",heights[i], weights[i], bmiValues[i], bmiStatus[i]);
        }
        sc.close();
    }
}
