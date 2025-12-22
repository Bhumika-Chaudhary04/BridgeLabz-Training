package strings;
import java.util.*;
public class SplitTextInWordsAndFindShortestAndLongestWords {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//input
		System.out.print("Enter a String : ");
		String text=sc.nextLine();
		//function call
		String[] arr=splitStringInWords(text);
		String[][] arr1=twoDArrayFun(arr);
		String[] ans=longestAndShortestStrings(arr1);
		System.out.println("Shortest word is : "+ans[0]);
		System.out.println("Longest word is "+ans[1]);
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
		//function to find longest and shortest word
		public static String[] longestAndShortestStrings(String[][] arr) {
			int shortestLength=Integer.MAX_VALUE;
			int longestLength=0;
			String shortestWord="";
			String longestWord="";
			for(int i=0;i<arr.length;i++) {
				if(Integer.parseInt(arr[i][1])>longestLength) {
					longestWord=arr[i][0];
					longestLength=Integer.parseInt(arr[i][1]);
				}
				if(Integer.parseInt(arr[i][1])<shortestLength) {
					shortestWord=arr[i][0];
					shortestLength=Integer.parseInt(arr[i][1]);
				}
			}
			String[] ans= {shortestWord,longestWord};
			return ans;
		}

}
