package methods;
import java.util.*;
public class NumberChecker4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//function call
		int count=countDigits(number);
		int[] digitsArray=digitsInArray(number);
		int[] reverseArr=reverseArray(number);
		boolean result=compareArrays(digitsArray,reverseArr);
		boolean palindrome=palindromeArray(digitsArray);
		boolean isDuck=isDuckNumber(number);
		//output
		System.out.println("Count of digits in number are : "+count);
		System.out.println("Digits Array : "+Arrays.toString(digitsArray));
		System.out.println("Reverse Array : "+Arrays.toString(reverseArr));
		System.out.println("Array and reverse array are equal ? "+result);
		System.out.println("It is a palindrome array ? "+palindrome);
		System.out.println("It is a duck number ? "+isDuck);
		
	}
	//function to count number of digits in the number
		public static int countDigits(int number) {
			int ans=0;
			while(number>0) {
				ans++;
				number/=10;
			}
			return ans;
		}
		//function to convert number in digit array
		public static int[] digitsInArray(int number) {
			int count=countDigits(number);
			int[] arr=new int[count];
			for(int i=count-1;i>=0;i--) {
				arr[i]=number%10;
				number/=10;
			}
			return arr;
		}
		//function to reverse array
		public static int[] reverseArray(int number) {
			int[] arr=digitsInArray(number);
			int i=0;
			int j=arr.length-1;
			while(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			return arr;
		}
		//function to compare arrays
		public static boolean compareArrays(int[] arr,int[] brr) {
			if(arr.length!=brr.length) {
				return false;
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=brr[i]) {
					return false;
				}
			}
			return true;
		}
		//function to check if a number is palindrome
		public static boolean palindromeArray(int[] arr) {
			int i=0;
			int j=arr.length-1;
			while(i<j) {
				if(arr[i]!=arr[j]) return false;
				i++;
				j--;
			}
			return true;
		}
		//function to check if number is a duck number
		public static boolean isDuckNumber(int number) {
			int[] arr=digitsInArray(number);
			for(int i=1;i<arr.length;i++) {
				if(arr[i]==0) {
					return true;
				}
			}
			return false;
		}
}
