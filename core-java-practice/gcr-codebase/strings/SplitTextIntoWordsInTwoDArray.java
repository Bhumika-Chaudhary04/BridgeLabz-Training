package strings;
import java.util.*;
public class SplitTextIntoWordsInTwoDArray{
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//input 
		System.out.print("Enter a string: ");
		String str=sc.nextLine();
		//output
		String[] arr1=splitStringInWords(str);
		String[][] ans=twoDArrayFun(arr1);
		System.out.println("Words in the sentence with their corresponding lengths are : ");
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i][0]+" ");
			System.out.println(Integer.parseInt(ans[i][1]));
		}
		
		
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
	public static String[][] twoDArrayFun(String[] arr){
		String[][] arr2=new String[arr.length][2];
		for(int i=0;i<arr.length;i++) {
			arr2[i][0]=arr[i];
			arr2[i][1]=String.valueOf(findLength(arr[i]));
		}
		return arr2;
		
	}

}
