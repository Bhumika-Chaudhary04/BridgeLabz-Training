import java.util.*;
public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.println("Enter a sentence : ");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		System.out.println("Reverse sentence with the word is : ");
		for(String word:words) {
			for(int i=word.length()-1;i>=0;i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
	}
}
