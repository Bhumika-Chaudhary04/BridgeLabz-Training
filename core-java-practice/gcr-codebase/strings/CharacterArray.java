package strings;
import java.util.*;
public class CharacterArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input
		System.out.print("Enter a string : ");
		String str=sc.next();
		//generate character array
		char[] arr1=CharArray(str);
		char[] arr2=str.toCharArray();
		//comapring both outputs
		boolean res=Arrays.equals(arr1,arr2);
		System.out.println("Both built in method and user defined method produced same result ? "+res);
		
	}
	public static char[] CharArray(String str) {
		char[] arr=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			arr[i]=str.charAt(i);
		}
		return arr;
	}

}
