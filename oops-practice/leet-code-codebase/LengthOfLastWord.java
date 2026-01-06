package leetcode;
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) return 0;
        return words[words.length - 1].length();
    }
    public static void main(String[] args) {
        String input = "Hello World";
        int result = lengthOfLastWord(input);
        System.out.println("Length of last word: " + result);
    }
}
