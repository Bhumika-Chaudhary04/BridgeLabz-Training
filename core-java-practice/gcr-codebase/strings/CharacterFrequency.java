package strings;
import java.util.Scanner;
public class CharacterFrequency {
    // Method to find frequency and return result in 1D String array
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();   // store characters
        int[] freq = new int[chars.length];  // store frequency
        // Initialize frequency array
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 1;
        }
        // Nested loops to find frequency
        for (int i=0;i<chars.length; i++) {
            if (chars[i]=='0') {
                continue;
            }
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }
        // Store result in 1D String array
        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }
        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[] frequencyResult = findFrequency(text);
        // Display result
        System.out.println("Character Frequencies:");
        for (String s : frequencyResult) {
            System.out.println(s);
        }
    }
}

