import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        // Declare variables
        String inStr;
        String outStr = "";
        // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a plain text string: ");
        inStr = in.next().toUpperCase();
        in.close();
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char tempChar = inStr.charAt(charIdx);
            if (tempChar >= 'A' && tempChar <= 'Z') {
                outStr += Character.toString((char) ('A' + 'Z' - tempChar));
            }
        }
        System.out.println("The ciphertext string is: " + outStr);
    }
}
