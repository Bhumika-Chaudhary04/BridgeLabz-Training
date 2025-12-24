package methods;
import java.util.*;
public class SumOfNaturalNumbersRecursive {
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		if(number<=0) {
			System.out.println("Not a natural number");
			return;
		}
		//function call
		int recursiveSumValue=recursiveSum(number);
		int sumUsingFormulaValue=sumUsingFormula(number);
		System.out.println("Sum of natural numbers by recursive function is "+recursiveSumValue +" , sum by formula is "+sumUsingFormulaValue);
		//check if both are equal
		boolean result=recursiveSumValue==sumUsingFormulaValue;
		System.out.println("Sum by recursive approach and using formula are equal ? "+result);
		
		
	}
	 //function to find sum of natural numbers using recursion
	public static int recursiveSum(int number) {
		if(number==0) {
			return number;
		}
		return number+recursiveSum(number-1);
	}
	//function to find sum using formula
	public static int sumUsingFormula(int number) {
		return number*(number+1)/2;
	}

}
