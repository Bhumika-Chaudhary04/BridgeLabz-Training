package methods;
import java.util.*;
public class NumberChecker3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//function call
		int noOfDigits=countDigits(number);
		int[] digitsInArr=digitsInArray(number);
		int sumOfDigits=findSum(number);
		int sumOfSquaresOfDigits=findSumOfSquares(number);
		boolean isHarshadNumber=isHarshadNumber(number);
		int[][] frequency=frequency(number);
		//output
		System.out.println("Number of digits in the number are : "+noOfDigits);
		System.out.println("Array representation of the number is : "+Arrays.toString(digitsInArr));
		System.out.println("Sum of Digits : "+sumOfDigits);
		System.out.println("Sum of Square of Digits : "+sumOfSquaresOfDigits);
		System.out.println("Is the number a Harshad Number ? "+isHarshadNumber);
		System.out.println("Frequency of the each digit in the number is : ");
		for(int i=0;i<frequency.length;i++) {
			System.out.print(frequency[i][0]+" ");
			System.out.println(frequency[i][1]);
		}
		
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
	//function to find sum of the digits
	public static int findSum(int number) {
		int sum=0;
		int[] arr=digitsInArray(number);
		for(int i:arr) {
			sum+=i;
		}
		return sum;
	}
	//function to find the sum of squares of the digits
	public static int findSumOfSquares(int number) {
		int sum=0;
		int[] arr=digitsInArray(number);
		for(int i:arr) {
			sum+=Math.pow(i,2);
		}
		return sum;
	}
	//function to find if the number is harshad number
	public static boolean isHarshadNumber(int number) {
		int sum=findSum(number);
		return number%sum==0;
	}
	//function to find frequency of digit in the array
	public static int[][] frequency(int number){
		int[] arr=digitsInArray(number);
		int[][] freq=new int[arr.length][2];
		for(int i=0;i<arr.length;i++) {
			freq[i][0]=arr[i];
			freq[i][1]=1;
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) {
					freq[i][1]+=1;
				}
			}
		}
		return freq;
 	}
}
