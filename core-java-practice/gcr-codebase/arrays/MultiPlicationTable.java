package arrays;
import java.util.*;
public class MultiPlicationTable {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//array declartion
		int[] tableArray=new int[10];
		for(int i=1;i<=10;i++) {
			tableArray[i-1]=number*i;
		}
		//output
		System.out.println("Multiplication table of "+number+" is : ");
		for(int i=1;i<=10;i++) {
			System.out.println(number+" * "+i+" = "+tableArray[i-1]);
		}
		sc.close();
		
	}

}
