package arrays;
import java.util.*;
public class MultiplicationTableFromSixToNineArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int number=sc.nextInt(); //input
		int[] tableArray=new int[4];
		
		//logic 
		for(int i=0;i<tableArray.length;i++) {
			tableArray[i]=number*(i+6);
		}
		
		//output
		System.out.println("Multiplication table of "+number +" from six to nine is : ");
		for(int i=6;i<=9;i++) {
			System.out.println(number +" * " + i +" = " +tableArray[i-6]);
		}
		
	}

}
