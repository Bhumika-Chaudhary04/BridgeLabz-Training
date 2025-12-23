package strings;
import java.util.*;
public class FrequencyOfCharactersUsingCharAt {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		//user input 
		System.out.print("Enter a string : ");
		String text=sc.next();
		//output
		String[][] ans=findFrequency(text);
		display(ans);
				
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
	//method to find frequency 
	public static String[][] findFrequency(String s){
		int[] freqArray=new int[256];
		for(int i=0;i<findLength(s);i++) {
			freqArray[s.charAt(i)]++;
		}
		String[][] ansArray=new String[findLength(s)][2];
		for(int i=0;i<findLength(s);i++) {
			ansArray[i][0]=String.valueOf(s.charAt(i));
			ansArray[i][1]=String.valueOf(freqArray[s.charAt(i)]);
		}
		return ansArray;
	}
	//function to display output
	public static void display(String[][] ansArray) {
		for(int i=0;i<ansArray.length;i++) {
			System.out.println("Frequency of character "+ansArray[i][0]+" is "+ansArray[i][1]);
		}
	}

}
