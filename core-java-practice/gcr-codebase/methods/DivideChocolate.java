package methods;
import java.util.*;
public class DivideChocolate {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.println("Enter nuumber of Chocolates: ");
		int numberOfChocolates=sc.nextInt();
		System.out.println("Enter number of children: ");
		int numberOfChildren=sc.nextInt();
		//output
		int[] result=findChocolatesToEachChildrenNRemainingChocolates(numberOfChocolates,numberOfChildren);
		System.out.println("Chocolates given to each children are : "+result[0]);
		System.out.println("Remaining chocolates are : "+result[1]);
		
		
	}
	public static int[] findChocolatesToEachChildrenNRemainingChocolates(int numberOfChocolates,int numberOfChildren) {
		int chocolatesToEachChildren=numberOfChocolates/numberOfChildren;
		int remainingChocolates=numberOfChocolates%numberOfChildren;
		return new int[] {chocolatesToEachChildren,remainingChocolates};
	}

}
