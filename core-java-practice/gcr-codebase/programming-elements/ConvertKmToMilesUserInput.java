import java.util.*;
public class ConvertKmToMilesUserInput {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double km;
		System.out.print("Enter distance in kms ");
		km=input.nextDouble(); //user input
		double miles=km/1.6; //converting distance from kilometer to miles
		System.out.println("The total miles is "+miles+" miles for the given "+km);
		
	}

}
