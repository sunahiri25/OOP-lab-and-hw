import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        // Declare variables
        String inStr;
        String outStr = "";
        // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        inStr = in.next().toUpperCase();
        in.close();
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char tempChar = inStr.charAt(charIdx);
            if (tempChar >= 'D' && tempChar <= 'Z') {
                outStr += Character.toString((char) (tempChar - 3));
            } else if (tempChar >= 'A' && tempChar <= 'C') {
                outStr += Character.toString((char) (tempChar + 23));
            }
        }
        System.out.println("The plaintext string is: " + outStr);
    }
}
