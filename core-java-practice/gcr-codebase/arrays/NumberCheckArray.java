package arrays;
import java.util.*;
public class NumberCheckArray {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//array_declaration
		int[] numberArray=new int[5];
		//user input
		System.out.println("Enter five integers");
		for(int i=0;i<numberArray.length;i++) {
			numberArray[i]=sc.nextInt();
		}
		//logic
		for(int i=0;i<numberArray.length;i++) {
			if(numberArray[i]<0) {
				System.out.println(numberArray[i]+" is negative");
			}
			else if(numberArray[i]==0) {
				System.out.println(numberArray[i]+" is zero");
			}
			else {
				if(numberArray[i]%2==0) {
					System.out.println(numberArray[i]+" is an even positive number.");
				}
				else {
					System.out.println(numberArray[i]+" is an odd posiitve number.");
				}
			}
			
		}
		//comparing first and last element of array
		if(numberArray[0]==numberArray[numberArray.length-1]) {
			System.out.println("First and last numebrs are equal");
		}
		else if(numberArray[0]<numberArray[numberArray.length-1]) {
			System.out.println("First number is less than the last number.");
		}
		else {
			System.out.println("First number is greater than the last number.");
		}
	}

}
