package methods;
import java.util.*;
public class StudentVoteChecker {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		//user input
		System.out.println("Enter ages of 10 students : ");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<10;i++) {
			boolean result=canStudentVote(arr[i]);
			System.out.println("Can Student "+i+" with age "+ arr[i] + " vote ? "+result);
		}
		
	}
	//method to check student can vote or not
	public static boolean canStudentVote(int age) {
		if(age<0) return false;
		return age>=18;
	}
	

}
