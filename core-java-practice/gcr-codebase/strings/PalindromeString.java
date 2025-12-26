package extras;
import java.util.*;
public class PalindromeString {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String string=sc.nextLine();
		//function call
		boolean result=isPalindromeString(string);
		//output
		System.out.println("String is palindrome ? "+result);
		
	}
	//function to check if string is palindrome
	public static boolean isPalindromeString(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
