package scenario_based;
import java.util.*;;
public class SentenceFormatter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//user input
		System.out.print("Enter a sentence : ");
		String text=sc.nextLine();
		//method call
		String ans=sentenceFormatter(text);
		//output
		System.out.println("Foramtted sentence is : "+ans);	
	}
	public static String sentenceFormatter(String text) {
        if (text==null || text.trim().isEmpty()) return "";
        text=text.trim().replaceAll("\\s+", " ");
        //ensure one space after punctuation
        text=text.replaceAll("\\s*([.!?])\\s*", "$1 ");
        //capitalize first letter of paragraph
        text=text.substring(0,1).toUpperCase()+text.substring(1);
        //capitalize letter after punctuation
        StringBuilder result=new StringBuilder();
        boolean capitalizeNext=false;
        for (char ch : text.toCharArray()) {
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext=false;
            } 
            else {
                result.append(ch);
            }
            if (ch == '.' || ch=='?' || ch == '!') {
                capitalizeNext=true;
            }
        }
        return result.toString().trim();
    }
}