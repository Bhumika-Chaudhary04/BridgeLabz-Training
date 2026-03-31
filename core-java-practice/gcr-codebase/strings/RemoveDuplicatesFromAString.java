package extras;
import java.util.*;
public class RemoveDuplicatesFromAString {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String string=sc.nextLine();
	    //function call
		String result=removeDuplicates(string);
		System.out.println("String after removing duplicates : "+result);
	}
	//function to remove duplicates from a string
	public static String removeDuplicates(String string) {
		String result="";
		for(char ch:string.toCharArray()) {
			if(result.indexOf(ch)==-1) {
				result+=ch;
			}
		}
		return result;
	}
}
