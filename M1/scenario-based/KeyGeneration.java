package scenario-based;
import java.util.*;
public class KeyGeneration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-- > 0) {
			String str=sc.nextLine();
			if(str.length()==0) {
				System.out.println("Invalid Input (empty string)");
				continue;
			}
			if(str.length()<6) {
				System.out.println("Invalid Input (length<6)");
				continue;
			}
			if(str.contains(" ")) {
				System.out.println("Invalid Input (contains space)");
				continue;
			}
			if(str.matches(".*\\d+.*")) {
				System.out.println("Invalid input (contins digit)");
				continue;
			}
			if(!str.matches("^[a-zA-Z]+$")) {
				System.out.println("Invalid input (contains special character)");
				continue;
			}
			str=str.toLowerCase();
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)%2!=0) {
					sb.append(str.charAt(i));
				}
			}
			sb.reverse();
			for(int i=0;i<sb.length();i+=2) {
				sb.setCharAt(i,(char)(sb.charAt(i)-32));
			}
			if(sb.length()==0) {
				System.out.println("The generated key is - (empty string)");
				continue;
			}
			System.out.println("The generated key is - "+sb.toString());
			
		}
	}

}
