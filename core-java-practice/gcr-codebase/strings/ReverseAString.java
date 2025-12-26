package extras;
import java.util.*;
public class ReverseAString {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter String : ");
		String string=sc.nextLine();
		//function call
		String revString=reverseString(string);
		//output
		System.out.println("Reverse string : "+revString);
	}
	//function to reverse string
	public static String reverseString(String str) {
		String revString=new String();
		int i=str.length()-1;
		while(i>=0) {
			revString+=str.charAt(i);
			i--;
		}
		return revString;
	}
}
