package strings;
import java.util.*;
public class ConvertToUpperCaseNCompare {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//input
		System.out.print("Enter a string : ");
		String str1=sc.nextLine();
		String str2=lowerToUpperCase(str1);
		String str3=str1.toUpperCase();
		//check strings
		boolean res=str2.equals(str3);
		System.out.println("Both built in user defined method returns the same string value ? "+res);
		
		
	}
	public static String lowerToUpperCase(String str1) {
		String str2=new String();
		for(int i=0;i<str1.length();i++) {
			//lower case to upper case
			if(str1.charAt(i)>=97 && str1.charAt(i)<=122) {
				str2+=((char)(str1.charAt(i)-32));
			}
			else {
				str2+=str1.charAt(i);
			}
			
		}
		return str2;
		
	}
	public static boolean comapreString(String str1,String str2) {
		//if length of strings are not equal return false
		if(str1.length()!=str2.length()) {
			return false;
		}
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) return false;
		}
		return true;
	}
	

}
