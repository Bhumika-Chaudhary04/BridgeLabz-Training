package extras;
import java.util.*;
public class CountSubStringOccurences {
	//scanner object
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String string=sc.nextLine();
		System.out.print("Enter SubString : ");
		String subString=sc.nextLine();
	    //function call
		int count=subStringOccurences(string,subString);
		System.out.println("Substring occurences count in the given string : "+count);
	}
	//method to count substrings in a string
	public static int subStringOccurences(String string,String subString) {
		int count=0;
		for(int i=0;i<=string.length()-subString.length();i++) {
			if(string.substring(i,i+subString.length()).equals(subString)) {
				count++;
			}
		}
		return count;
	}
	
}
