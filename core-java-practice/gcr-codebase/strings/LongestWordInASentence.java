package extras;
import java.util.*;
public class LongestWordInASentence {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		String sentence=sc.nextLine();
	    //function call
		String result=longestWord(sentence);
		System.out.println("Longest word in the sentence is : "+result);
	}
	//funtion to find longest word in a sentence
	public static String longestWord(String sentence) {
		String[] words=sentence.split(" ");
		String result=new String();
		int wordLength=0;
		for(String word:words) {
			if(word.length()>wordLength) {
				wordLength=word.length();
				result=word;
			}
		}
		return result;
	}
}
