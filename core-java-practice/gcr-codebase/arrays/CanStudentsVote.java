package arrays;
import java.util.*;
public class CanStudentsVote {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//declaring an array
		int[] ageArray=new int[10];
		//taking user input and initializing the array
		System.out.println("Enter age of students");
		for(int i=0;i<10;i++) {
			ageArray[i]=sc.nextInt();
		}
		
		//checking age of each student 
		for(int i=0;i<ageArray.length;i++) {
			if(ageArray[i]<0) {
				System.out.println("Invalid age");
			}
			else if(ageArray[i]>=18) {
				System.out.println("The student with the age "+ageArray[i]+" can vote.");
			}
			else {
				System.out.println("The student with the age "+ageArray[i]+" cannot vote.");
			}
		}
	}

}
