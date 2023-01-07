import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // Define variables
        String inStr;
        int inStrLen;
        String outStr = "";
        // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next();
        inStrLen = inStr.length();
        in.close();
        // Use inStr.charAt(index) in a loop to extract each character
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            outStr += inStr.charAt(charIdx);
        }
        System.out.println("The reverse of the String '" + inStr + "' is '" + outStr + "'");
    }
}
