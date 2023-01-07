import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
        // Define variables
        String inStr;
        boolean palindromic = true;
        String testStr;
        // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        inStr = in.next();
        testStr = inStr.toLowerCase();
        in.close();
        
        for (int fIdx = 0, bIdx = inStr.length() - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            if (!(testStr.charAt(fIdx) == testStr.charAt(bIdx))) {
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
