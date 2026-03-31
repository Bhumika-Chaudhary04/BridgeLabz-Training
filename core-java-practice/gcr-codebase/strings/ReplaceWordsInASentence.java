package extras;
import java.util.*;
public class ReplaceWordsInASentence {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		String sentence=sc.nextLine();
		System.out.print("Enter first word : ");
		String word1=sc.next();
		System.out.print("Enter second word : ");
		String word2=sc.next();
	    //function call
		String result=replaceWords(sentence,word1,word2);
		//output
		System.out.println("Sentence after replacing "+word1+" with "+word2+" is : \n"+result);
	}
	//funtion to find longest word in a sentence
	public static String replaceWords(String sentence,String word1,String word2) {
		sentence=sentence.replaceAll(word1,word2);
		return sentence;
	}
}
