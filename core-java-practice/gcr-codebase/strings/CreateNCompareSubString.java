package strings;
import java.util.*;
public class CreateNCompareSubString {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//input
		System.out.print("Enter a string : ");
		String str=sc.next();
		System.out.print("Enter starting index : ");
		int startIndex=sc.nextInt();
		System.out.print("Enter ending index : ");
		int endIndex=sc.nextInt();
		//function call
		String str2=subString(str,startIndex,endIndex);
		//built in function
		String str3=str.substring(startIndex,endIndex);
		boolean res=str2.equals(str3);
		//output : true or false
		System.out.println("Both produced the same result ? "+res);
	}
	
	// function to generate substring
	public static String subString(String str,int startIndex,int endIndex) {
		String str2=new String();
		for(int i=startIndex;i<endIndex;i++) {
			str2+=str.charAt(i);
		}
		return str2;
	}

}
