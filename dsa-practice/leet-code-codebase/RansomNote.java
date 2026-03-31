package dsa_leetcode;

import java.util.*;

public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26]; // 26 letters a-z

        // Count characters in magazine
        for (char ch : magazine.toCharArray()) {
            int idx = ch - 'a';
            arr[idx]++;
        }

        // Check characters for ransomNote
        for (char ch : ransomNote.toCharArray()) {
            int idx = ch - 'a';
            if (!(arr[idx]-- > 0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ransom note: ");
        String ransomNote = sc.nextLine();

        System.out.print("Enter magazine: ");
        String magazine = sc.nextLine();

        boolean result = canConstruct(ransomNote, magazine);
        System.out.println("Can construct ransom note? " + result);

        sc.close();
    }
}
