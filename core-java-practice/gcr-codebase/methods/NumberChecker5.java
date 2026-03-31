package methods;
import java.util.*;
public class NumberChecker5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//function call
		boolean isPrime=isPrime(number);
		boolean isNeon=isNeon(number);
		boolean isSpy=isSpy(number);
		boolean isAutomorphic=automorphicNumber(number);
		boolean isBuzz=isBuzz(number);
		//output
		System.out.println("Number is Prime ? "+isPrime);
		System.out.println("Number is Neon ? "+isNeon);
		System.out.println("Number is Spy ? "+isSpy);
		System.out.println("Number is AutoMorphic ? "+isAutomorphic);
		System.out.println("Number is Buzz ? "+isBuzz);
		
		
	}
	    //function to check if the number is a prime number
	    public static boolean isPrime(int number) {
		    if(number<=1) return false;
		    for(int i=2;i*i<=number;i++) {
			    if(number%i==0) return false;
		    }
		    return true;
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
	    //function to find the sum of squares of the digits
		public static int findSumOfSquares(int number) {
			int sum=0;
			int[] arr=digitsInArray(number);
			for(int i:arr) {
				sum+=(i*i);
			}
			return sum;
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
		//function to find sum of the digits
	    public static int findMul(int number) {
		    int mul=1;
		    int[] arr=digitsInArray(number);
		    for(int i:arr) {
			    mul*=i;
		    }
		    return mul;
	    }
	    public static boolean isNeon(int number) {
	    	int sum=findSumOfSquares(number);
	    	return sum==number;
	    }
	    public static boolean isSpy(int number) {
	    	return findSum(number)==findMul(number);
	    }
	    public static boolean automorphicNumber(int number) {
	    	int square=number*number;
	    	int temp=number;
	    	while(temp>0) {
	    		if(square%10!=temp%10) return false;
	    		square/=10;
	    		temp/=10;
	    	}
	    	return true;
	    }
	    public static boolean isBuzz(int number) {
	    	return number%7==0 || number%10==7;
	    }
}
