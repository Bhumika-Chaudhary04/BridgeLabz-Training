import java.util.*;
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str=sc.next().toLowerCase();
		char ch=str.chars().mapToObj(e->(char)e).filter(e->str.indexOf(e)==str.lastIndexOf(e)).findFirst().orElse(null);
		System.out.println(ch);
	}

}
