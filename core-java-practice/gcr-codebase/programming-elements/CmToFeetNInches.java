import java.util.*;
public class CmToFeetNInches {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter height in cm ");
		double heightInCM=sc.nextDouble(); //user Input
		
		double totalInches=heightInCM/2.54; //cmToInches
		int heightInFeet=(int)(totalInches/12); //Feet
		double heightInInches=totalInches%12;  //Inches
		
		System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f" , heightInCM,heightInFeet,heightInInches);
		
		
		
	}

}
