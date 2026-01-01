package scenario_based;
import java.util.Scanner;
public class ParagraphAnalyzer {
	//method to count words in a paragraph
    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) 
        	return 0;
        String[] words = text.trim().split("\\s+");
        return words.length;
    }
    //method to find longest word in a paragraph
    public static String longestWord(String text) {
        if (text==null || text.trim().isEmpty()) 
        	return "";
        String longest="";
        for (String word:text.split("\\s+")) {
            word=word.replaceAll("[^a-zA-Z]", ""); // remove punctuation
            if (word.length()>longest.length()) {
                longest=word;
            }
        }
        return longest;
    }
    //replace all occurrences of a word with a new word
    public static String replaceWordIgnoreCase(String text, String oldWord, String newWord) {
        if (text==null) 
        	return "";
        return text.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a paragraph:");
        String paragraph=sc.nextLine();
        // handle empty / spaces-only input
        if (paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty. Nothing to analyze.");
            sc.close();
            return;
        }
        System.out.print("Enter the word to replace: ");
        String oldWord=sc.nextLine();
        System.out.print("Enter the new word: ");
        String newWord=sc.nextLine();
        System.out.println("\n--- Analysis Result ---");
        System.out.println("Word Count: " + countWords(paragraph));
        System.out.println("Longest Word: " + longestWord(paragraph));
        String updatedText=replaceWordIgnoreCase(paragraph, oldWord, newWord);
        System.out.println("Updated Paragraph: " + updatedText);
        sc.close();
    }
}