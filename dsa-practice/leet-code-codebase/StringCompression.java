import java.util.Scanner;

public class StringCompression {

    public static int compress(char[] chars) {

        int count = 0;
        char previous = '@';
        StringBuilder sb = new StringBuilder();

        for (char ch : chars) {

            if (count == 0) {
                sb.append(ch);
                count = 1;
                previous = ch;
            }

            else if (previous == ch) {
                count++;
            }

            else {
                if (count != 1) {
                    sb.append(count);
                }
                sb.append(ch);
                count = 1;
                previous = ch;
            }
        }

        // Append last character count
        if (count != 1) {
            sb.append(count);
        }

        int newLength = sb.length();

        // Copy back into original array
        for (int i = 0; i < newLength; i++) {
            chars[i] = sb.charAt(i);
        }

        return newLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();

        int length = compress(chars);

        System.out.println("Compressed Length: " + length);
        System.out.print("Compressed Array: ");

        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }

        sc.close();
    }
}