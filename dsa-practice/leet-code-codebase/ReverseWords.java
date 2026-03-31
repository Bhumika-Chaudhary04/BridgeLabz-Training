package dsa_leetcode;

import java.util.Scanner;

public class ReverseWords {
	//method to reverse words of a sentence
	public static String reverseWords(String s) {
		//split string into arrays
		String[] words = s.trim().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			sb.append(words[i]).append(" ");
		}
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		String result = reverseWords(input);
		System.out.println("Reversed Words: " + result);
		sc.close();
	}
}
