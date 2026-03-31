package extras;
import java.util.*;
public class MostFrequentCharacter {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String string=sc.nextLine();
		//function call
		char result=mostFrequentCharacter(string);
		System.out.println("Most Frequent Character : "+result);
	}
	//method to find most frequent character
	public static char mostFrequentCharacter(String str) {
		int[] freq=new int[256];
        for(char ch:str.toCharArray()) {
            freq[ch]++;
        }
        int max=0;
        char ans=' ';
        for (char ch:str.toCharArray()) {
            if (freq[ch]>max) { 
            	max=freq[ch]; 
            	ans=ch; 
            }
        }

        return ans;
    }
}
