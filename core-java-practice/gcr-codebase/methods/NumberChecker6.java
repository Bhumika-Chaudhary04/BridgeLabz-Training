package methods;
import java.util.*;
public class NumberChecker6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a number : ");
		int number=sc.nextInt();
		//function call
		boolean isPerfectNumber=isPerfectNumber(number);
		boolean isAbundant=isAbundant(number);
		boolean isDeficient=isDeficient(number);
		boolean isStrongNumber=isStrongNumber(number);
		//output
		System.out.println("Number is a perfect Number ? "+isPerfectNumber);
		System.out.println("Number is a abundant number ? "+isAbundant);
		System.out.println("Number is a deficeint number ? "+isDeficient);
		System.out.println("Number is a strong number ? "+isStrongNumber);
		
		
	}
	    //function to check if the number is a perfect number
	    public static boolean isPerfectNumber(int number) {
	    	if(number<=1) return false;
	    	int sum=0;
	    	for(int i=1;i<number;i++) {
	    		if(number%i==0) sum+=i;
	    	}
	    	return sum==number;
	    }
	    //function to check if number is a abundant number
	    public static boolean isAbundant(int number) {
	    	if(number<=1) return false;
	    	int sum=0;
	    	for(int i=1;i<number;i++) {
	    		if(number%i==0) sum+=i;
	    	}
	    	return sum>number;
	    }
	    //function to check if a number is a deficient number
	    public static boolean isDeficient(int number) {
	    	if(number<=1) return false;
	    	int sum=0;
	    	for(int i=1;i<number;i++) {
	    		if(number%i==0) sum+=i;
	    	}
	    	return sum<number;
	    }
	    //function to find factorial of a number
	    public static int factorial(int number) {
	    	if(number==0 || number==1) {
	    		return number;
	    	}
	    	return number*factorial(number-1);
	    }
	    //function to check if a number is a strong number
	    public static boolean isStrongNumber(int number) {
	    	if(number==0) return false;
	    	int temp=number;
	    	int sum=0;
	    	while(temp>0) {
	    		int f=temp%10;
	    		sum+=factorial(f);
	    		temp/=10;
	    	}
	    	return sum==number;
	    }
	    
	    
}
