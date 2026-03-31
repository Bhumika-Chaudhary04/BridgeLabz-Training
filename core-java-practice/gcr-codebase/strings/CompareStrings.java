package strings;
import java.util.*;
public class CompareStrings {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//input
		System.out.print("Enter first string : ");
		String s1=sc.next();
		System.out.print("Enter second string : ");
		String s2=sc.next();
        //function call
		boolean res=compareTwoStrings(s1,s2);
		boolean res2=s1.equals(s2);
		//output
		System.out.println("Both strings are equal by your function ? "+res);
		System.out.println("Both strings are equal by built in function ? "+res2);
	}
	// user defined function to compare two strings
	public static boolean compareTwoStrings(String s1,String s2) {
		//if only length of two strings are different they can't be equal to each other
		if(s1.length()!=s2.length()) {
			return false;
		}
		//comparing each character
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) return false;
		}
		return true;
	}
}
