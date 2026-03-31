package strings;
import java.util.*;
public class UniqueCharacters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter text : ");
		String text=sc.next();
		char[] res=uniqueCharacters(text);
		display(res);
		
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
		//function to find the unique characters
		public static char[] uniqueCharacters(String text) {
			char[] res=new char[text.length()];
			int index=0;
			for(int i=0;i<findLength(text);i++) {
				boolean unique=true;
				for(int j=0;j<findLength(text);j++) {
					if(i!=j && text.charAt(i)==text.charAt(j)) {
						unique=false;
						break;
					}
				}
				if(unique) {
					res[index++]=text.charAt(i);
				}
			}
			char[] finalArray=new char[index];
			finalArray=res;
			return finalArray;
		}
		//function to display the result
		public static void display(char[] res) {
			System.out.println("Unique characters in the text are : ");
			for(int i=0;i<res.length;i++) {
				System.out.print(res[i]+" ");
			}
		}

}
