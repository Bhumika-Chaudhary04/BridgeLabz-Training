package strings;
import java.util.*;
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter input text : ");
		String text=sc.next();
		System.out.println("First non repeating character in the input text is : "+firstNonRepeatingChar(text));
	}
	//function to find first non repeating character using frequency array
	public static char firstNonRepeatingChar(String text) {
		int[] freq=new int[256];
		for(int i=0;i<text.length();i++) {
			freq[text.charAt(i)]++;
		}
		for(int i=0;i<text.length();i++) {
			if(freq[text.charAt(i)]==1) {
				return text.charAt(i);
			}
		}
		return ' ';
	}
}
