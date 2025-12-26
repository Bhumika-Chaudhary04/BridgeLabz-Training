package extras;
import java.util.*;
public class CompareStringsLexicographically {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first string : ");
		String string1=sc.nextLine();
		System.out.print("Enter second string : ");
		String string2=sc.nextLine();
	    //function call
		compareStringsLexicographically(string1,string2);
	}
	//method to compare two strings lexicographically without using built-in compare method
	public static void compareStringsLexicographically(String s1,String s2) {
		int len=Math.min(s1.length(),s2.length());
        for (int i=0;i<len;i++) {
            if (s1.charAt(i)!=s2.charAt(i)) {
                if (s1.charAt(i)<s2.charAt(i))
                    System.out.println(s1 + " comes before "+ s2+" in lexicographical order");
                else
                    System.out.println(s2 + " comes before " + s1+" in lexicographical order");
                return;
            }
        }

        if (s1.length()==s2.length())
            System.out.println("Both strings are equal in lexicographical order");
        else if (s1.length()<s2.length())
            System.out.println(s1 + " comes before " + s2+" in lexicographical order");
        else
            System.out.println(s2 + " comes before " + s1+" in lexicographical order");
    }
}
