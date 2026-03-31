package methods;
import java.util.*;
public class NumberChecker2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//function call
		int numberOfDigits=countDigits(number);
		int[] digitsInArray=digitsInArray(number);
		boolean isDuckNo = isDuckNumber(number);
		boolean isArmstrong=isArmstrong(number);
		int[] largestNSecondLargest=largestNSecondLargest(number);
		int[] smallestNSecondSmallest=smallestNSecondSmallest(number);
		System.out.println("Number of digits in : "+number+" are : "+numberOfDigits);
		System.out.println("Number in Array form : "+Arrays.toString(digitsInArray));
		System.out.println("Number is a duck number ? "+isDuckNo);
		System.out.println("Number is a ArmStrong Number? "+isArmstrong);
		System.out.println("The largest digit in the array is :"+largestNSecondLargest[0]);
		System.out.println("The second largest digit in the array is : "+largestNSecondLargest[1]);
		System.out.println("The smallest digit in the array is :"+smallestNSecondSmallest[0]);
		System.out.println("The second largest digit in the array is : "+smallestNSecondSmallest[1]);
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
	//function to check if number is a armstrong number
	public static boolean isArmstrong(int number) {
		int[] arr=digitsInArray(number);
		int sum=0;
		int l=arr.length;
		for(int i:arr) {
			sum+=Math.pow(i,l);
		}
		return sum==number;
	}
	//function to find largest and second largest number in array
	public static int[] largestNSecondLargest(int number) {
		int[] arr=digitsInArray(number);
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>largest) {
				secondLargest=largest;
				largest=i;
			}
			else if(i>secondLargest && i!=largest) {
				secondLargest=i;
			}
		}
		return new int[] {largest,secondLargest};
	}
	//function to find smallest and second smallest number in array
	public static int[] smallestNSecondSmallest(int number) {
		int[] arr=digitsInArray(number);
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i:arr) {
			if(i<smallest) {
				secondSmallest=smallest;
				smallest=i;
			}
			else if(i<secondSmallest&& i!=smallest) {
				secondSmallest=i;
			}
		}
		return new int[] {smallest,secondSmallest};
	}
	
	
}
