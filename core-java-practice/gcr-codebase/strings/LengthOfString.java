package strings;
import java.util.*;
public class LengthOfString {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//input
		System.out.print("Enter a string : ");
		String str=sc.next();
		int length1=findLength(str);
		int length2=str.length();
		//output
		System.out.println("Length of the string calculated by user defined function is "+length1);
		System.out.println("Length of the string calculated by built in function is "+length2);
		
		
	}
    //function to find length of the string
	public static int findLength(String str) {
		int count=0;
		//try catch block to handle exception
		try {
			while(true) {
				char ch=str.charAt(count);
				count++;
			}
		}
		catch(StringIndexOutOfBoundsException e) {

		}
		return count;
		
	}

}
