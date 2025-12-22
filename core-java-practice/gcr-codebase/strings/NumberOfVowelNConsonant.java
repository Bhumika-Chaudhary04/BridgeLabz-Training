package strings;
import java.util.*;
public class NumberOfVowelNConsonant {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String str=sc.nextLine();
		int[] ans=countVowelsNConsonants(str);
		System.out.println("Count of vowels is : "+ans[0]);
		System.out.println("Count of consonants is : "+ans[1]);
		
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
	//this functions returns count of vowels and consonants
	public static int[] countVowelsNConsonants(String str) {
		int[] ans=new int[2];
		int vowel=0;
		int consonant=0;
		for(int i=0;i<findLength(str);i++) {
			if(isVowelOrConsonant(str.charAt(i)).equals("Vowel")) {
				vowel++;
			}
			else if(isVowelOrConsonant(str.charAt(i)).equals("Consonant")){
				consonant++;
			}
		}
		ans[0]=vowel;
		ans[1]=consonant;
	    return ans;
	
	}

}
