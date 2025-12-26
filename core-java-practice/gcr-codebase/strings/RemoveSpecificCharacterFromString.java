package extras;
import java.util.*;
public class RemoveSpecificCharacterFromString {
	public static void main(String[] args) {
		//scanner object
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String : ");
		String string=sc.nextLine();
		System.out.print("Character to remove : ");
		char ch=sc.next().charAt(0);
		//function call
		String result=removeSpecificCharacter(string,ch);
		System.out.println("Modified String : "+result);
	}
	//method to remove specific character
	public static String removeSpecificCharacter(String str,char ch) {
		String result="";
        for (char c:str.toCharArray())
            if (c!=ch) result+=c;
        return result;
    }
}
