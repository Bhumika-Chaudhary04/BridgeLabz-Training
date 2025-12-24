package methods;
import java.util.*;
public class CalculateTrigonometricFunctions {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter angle in degrees : ");
		double angleInDegrees=sc.nextDouble();
		//function call
		double[] result=calculateTrigonometricFunctions(angleInDegrees);
		System.out.printf("Sine : %.2f\n",result[0]);
		System.out.printf("Cosine : %.2f\n",result[1]);
		System.out.printf("Tangent : %.2f\n",result[2]);
		
	}
	//function to calculate trigonometric functions
	public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
		double angleInRadians=Math.toRadians(angleInDegrees);
		double sine=Math.sin(angleInRadians);
		double cosine=Math.cos(angleInRadians);
		double tangent=Math.tan(angleInRadians);
		return new double[] {sine,cosine,tangent};
	}
}
