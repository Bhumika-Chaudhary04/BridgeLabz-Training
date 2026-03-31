package strings;
import java.util.*;
public class TrimLeadingNTrailingSpace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string : ");
		String str=sc.nextLine();
		//removing leading and trailing spaces using user defined function 
		int[] arr=trimString(str);
		String ans=subString(str,arr[0],arr[1]+1);
		System.out.println("String after removing leading and trailing spaces using user defined function is "+ans);
		//removing trailing and leading spaces using built in method
		String ans2=str.trim();
		boolean result=ans.equals(ans2);
		System.out.println("Both user defined and built in method returns same string ? "+result);
	}
	// function to generate substring
		public static String subString(String str,int startIndex,int endIndex) {
			String str2=new String();
			for(int i=startIndex;i<endIndex;i++) {
				str2+=str.charAt(i);
			}
			return str2;
		}
		// user defined function to compare two strings
		public static boolean compareTwoStrings(String s1,String s2) {
			//if only length of two strings are different they can't be equal to each other
			if(findLength(s1)!=findLength(s2)) {
				return false;
			}
			//comparing each character
			for(int i=0;i<findLength(s1);i++) {
				if(s1.charAt(i)!=s2.charAt(i)) return false;
			}
			return true;
		}
		//user defined function to find the length of a string
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
		public static int[] trimString(String str) {
			int start=-1;
			int end=-1;
			for(int i=0;i<findLength(str);i++) {
				if(str.charAt(i)!=' ') {
					start=i;
					break;
				}
			}
			for(int i=findLength(str)-1;i>=0;i--) {
				if(str.charAt(i)!=' ') {
					end=i;
					break;
				}
			}
			return new int[] {start,end};
		}
}
