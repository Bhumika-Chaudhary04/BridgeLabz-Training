package strings;
import java.util.*;
public class StringIndexOutOfBoundException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.next();
		//calling method to generate exception
		try {
			generateException(str);
		} catch (Exception e) {
			System.out.println("Exception caught in main: " + e);
		}
		//calling method to handle exception
		handleException(str);
		
	}
	public static void generateException(String str) {
		char ch=str.charAt(str.length());
	}
	public static void handleException(String str) {
		try {
			char ch=str.charAt(str.length());
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bound exception : " + e.getMessage());
		}
	}

}
