import java.util.Scanner;

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        // Define variables
        String inStr, testStr;
        String newStr = "";
        boolean palindromic = true;
        // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        inStr = in.nextLine();
        testStr = inStr.toLowerCase();
        in.close();
        for (int charIdx = 0; charIdx < testStr.length(); charIdx++) {
            if (Character.isLetter(testStr.charAt(charIdx))) {
                newStr += Character.toString(testStr.charAt(charIdx));
            }
        }
        for (int fIdx = 0, bIdx = newStr.length() - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            if (!(newStr.charAt(fIdx) == newStr.charAt(bIdx))) {
                palindromic = false;
            }
        }
        if (palindromic) {
            System.out.println("'" + inStr + "' is a palindrome");
        } else {
            System.out.println("'" + inStr + "' is not a palindrome");
        }
    }
}
