package methods;
import java.util.*;
public class BMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 10 persons, 3 columns (weight, height, BMI)
		double[][] data = new double[10][3];
		// input weight and height
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter details of person " + (i + 1));
			System.out.print("Weight (in kg): ");
			data[i][0] = sc.nextDouble();
			System.out.print("Height (in cm): ");
			data[i][1] = sc.nextDouble();
		}
		// calculate BMI and store in 3rd column
		calculateBMI(data);
		// get BMI status of all persons
		String[] status = getBMIStatus(data);
		// display result
		System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
		for (int i=0;i<10;i++) {
			System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n",data[i][1], data[i][0], data[i][2], status[i]);
		}
	}

	// method to calculate BMI
	public static void calculateBMI(double[][] data) {
		for (int i=0;i<data.length;i++) {
			double weight=data[i][0];
			double heightInMeters=data[i][1]/100; //cm to meters
			double bmi=weight/(heightInMeters*heightInMeters);
			data[i][2]=bmi;
		}
	}

	// method to determine BMI status
	public static String[] getBMIStatus(double[][] data) {
		String[] status=new String[data.length];
		for (int i=0;i<data.length;i++) {
			double bmi=data[i][2];
			if (bmi<18.5) {
				status[i]="Underweight";
			} else if (bmi<25) {
				status[i]="Normal";
			} else if (bmi<40) {
				status[i]="Overweight";
			} else {
				status[i]="Obese";
			}
		}
		return status;
	}
}
