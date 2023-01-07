import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        // Define variables
        String inStr;
        boolean hexadecimal = true;
        // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        inStr = in.next();
        in.close();
        
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            char tempChar = inStr.charAt(charIdx);
            if (!((tempChar >= '0' && tempChar <= '9') || (tempChar >= 'a' && tempChar <= 'f') || (tempChar >= 'A' && tempChar <= 'F'))) {
                hexadecimal = false;
            }
        }
        if (hexadecimal) {
            System.out.println("'" + inStr + "' is a hex string");
        } else {
            System.out.println("'" + inStr + "' is NOT a hex string");
        }
    }
}