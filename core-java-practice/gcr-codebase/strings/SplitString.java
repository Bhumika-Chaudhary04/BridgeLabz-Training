package strings;
import java.util.*;
public class SplitString {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//input 
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		//output
		String[] arr1=splitStringInWords(str);
		String[] arr2=str.split(" ");
		boolean res=Arrays.equals(arr1,arr2);
		System.out.println("Array by user defined method is "+Arrays.toString(arr1));
		System.out.println("Array by built in method is "+Arrays.toString(arr2));
		System.out.println("Both built in method and user defined method returns the same result ? "+res);
	}
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
	//function to count number of words in the sentence
	public static int countWords(String str) {
		int count=0;
		for(int i=0;i<findLength(str);i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count+1;
	}
	//function to split string
	public static String[] splitStringInWords(String str) {
		int count=countWords(str);
		String[] arr=new String[count];
		int j=0;
		String str1=new String();
		int n=findLength(str);
		for(int i=0;i<n;i++) {
			if(str.charAt(i)==' ') {
				arr[j++]=str1;
				str1="";
			}
			else {
				str1+=str.charAt(i);
			}		
		}
		arr[j]=str1;
		return arr;
	}

}
