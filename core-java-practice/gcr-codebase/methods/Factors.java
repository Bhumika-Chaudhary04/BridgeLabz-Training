package methods;
import java.util.*;
public class Factors {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter number : ");
		int number=sc.nextInt();
		//function call
		int[] factors=findFactors(number);
		System.out.print("Factors of the given number are : ");
		for(int i:factors) {
			System.out.print(i+" ");
		}
		System.out.println();
		int sum=findSum(factors);
		int multiply=findMultiply(factors);
		int squareSum=findSumOfSquares(factors);
		System.out.println("Sum of the factors of the given number are : "+sum+" , multiple of the factors are : "+multiply+" , sum of the squares of factors are : "+squareSum);
	}
	public static int[] findFactors(int number) {
		int[] arr=new int[number];
		int j=0;
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				arr[j++]=i;
			}
		}
		int[] factors=new int[j];
		for(int i=0;i<factors.length;i++) {
			factors[i]=arr[i];
		}
		return factors;
	}
	public static int findSum(int[] factors) {
		int sum=0;
		for(int i:factors) {
			sum+=i;
		}
		return sum;
	}
	public static int findMultiply(int[] factors) {
		int multiply=1;
		for(int i:factors) {
			multiply*=i;
		}
		return multiply;
	}
	public static int findSumOfSquares(int[] factors) {
		int squareSum=0;
		for(int i:factors) {
			squareSum+=Math.pow(i,2);
		}
		return squareSum;
		
	}
}
