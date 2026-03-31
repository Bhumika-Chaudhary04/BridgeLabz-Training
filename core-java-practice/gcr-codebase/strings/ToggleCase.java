package extras;
import java.util.*;
public class ToggleCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String string=sc.nextLine();
	    //function call
		String result=toggleCase(string);
		System.out.println("String after toggle case  : "+result);
	}
	//togglecase method
	public static String toggleCase(String string) {
		String result=new String();
		char[] charArray=string.toCharArray();
		for(char ch:charArray) {
			if(Character.isLowerCase(ch)) {
				result+=Character.toUpperCase(ch);
			}
			else {
				result+=Character.toLowerCase(ch);
			}
		}
		return result;
	}
}
