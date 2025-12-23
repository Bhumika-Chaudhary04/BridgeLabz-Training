package strings;
import java.util.*;
public class FrequencyOfCharactersUsingUniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input
        System.out.print("Enter a string : ");
        String text = sc.next();
        // process
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = uniqueCharactersFrequency(uniqueChars, text);
        // output
        display(result);
    }
    // function to find length of the string
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // do nothing
        }
        return count;
    }
    // function to find unique characters
    public static char[] uniqueCharacters(String text) {
        int len=findLength(text);
        char[] temp=new char[len];
        int index=0;
        for (int i=0;i<len;i++) {
            boolean unique=true;
            for (int j=0;j<len;j++) {
                if (i!=j && text.charAt(i) == text.charAt(j)) {
                    unique=false;
                    break;
                }
            }
            if (unique) {
                temp[index++]=text.charAt(i);
            }
        }
        // copy exact size array
        char[] result=new char[index];
        for (int i=0;i<index;i++) {
            result[i]=temp[i];
        }
        return result;
    }

    // function to calculate frequency of unique characters
    public static String[][] uniqueCharactersFrequency(char[] arr, String text) {
        int[] freqArray = new int[256];
        int len=findLength(text);
        // count frequency from original string
        for (int i=0;i<len;i++) {
            freqArray[text.charAt(i)]++;
        }
        String[][] ans=new String[arr.length][2];
        for (int i=0;i<arr.length;i++) {
            ans[i][0]=String.valueOf(arr[i]);
            ans[i][1]=String.valueOf(freqArray[arr[i]]);
        }
        return ans;
    }

    // display output
    public static void display(String[][] ansArray) {
        for (int i=0;i<ansArray.length;i++) {
            System.out.println("Frequency of character " + ansArray[i][0] + " is " + ansArray[i][1]);
        }
    }
}
