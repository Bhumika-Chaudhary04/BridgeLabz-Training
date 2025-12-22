package strings;
import java.util.*;
public class VowelNConsonant {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		String[][] ansArray=vowelOrConsonant(str);
		System.out.println("Type of characters in string is: ");
		for(int i=0;i<ansArray.length;i++) {
			System.out.print(ansArray[i][0]+" ");
			System.out.println(ansArray[i][1]);
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
	//function to check if a character is vowel or consonant or something else
	public static String isVowelOrConsonant(char ch) {
			if(ch>=65 && ch<=90) {
				ch=(char)(ch+32);
			}
			if(!(ch>=97 && ch<=122)) {
				return new String("Not a letter");
			}
			else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				return new String("Vowel");
			}
			else {
				return new String("Consonant");
			}
		
	}
	//function to return the type of every character in the string
	public static String[][] vowelOrConsonant(String str){
		String[][] ansArray=new String[str.length()][2];
		for(int i=0;i<findLength(str);i++) {
			ansArray[i][0]=str.charAt(i)+"";
			if(isVowelOrConsonant(str.charAt(i)).equals("Vowel")){
				ansArray[i][1]="Vowel";
			}
			else if(isVowelOrConsonant(str.charAt(i)).equals("Consonant")) {
				ansArray[i][1]="Consonant";
			}
			else {
				ansArray[i][1]="Not a Letter";
			}
		}
		return ansArray;
	}

}
