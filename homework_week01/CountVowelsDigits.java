import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        // Define variables
        String inStr;
        int vowelsNum = 0;
        int digitsNum = 0;
        double vowelsPct;
        double digitsPct;
        int inStrLen;
        char tempChar;
        // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();
        inStrLen = inStr.length();
        in.close();
        // Extract each character and count
        for (int charIdx = 0; charIdx < inStrLen; charIdx++) {
            tempChar = inStr.charAt(charIdx);
            if (Character.isDigit(tempChar)) {
                digitsNum++;
            } else if (tempChar == 'a' || tempChar == 'e' || tempChar == 'i' || tempChar == 'o' || tempChar == 'u') {
                vowelsNum++;
            }
        }
        // Compute the percentages
        vowelsPct = (double) vowelsNum / inStrLen * 100;
        digitsPct = (double) digitsNum / inStrLen * 100;
        // Print results
        System.out.printf("Number of vowels: %d (%.2f%%)%n", vowelsNum, vowelsPct);
        System.out.printf("Number of digits: %d (%.2f%%)%n", digitsNum, digitsPct);
    }
}
