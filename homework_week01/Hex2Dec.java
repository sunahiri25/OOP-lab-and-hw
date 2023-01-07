import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        // Declare variables
        String inStr;
        int result;
        // Prompt and read input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        inStr = in.next();
        in.close();
        try {
            // Convert input hexadecimal string into its equivalent decimal number
            result = Integer.parseInt(inStr, 16);
            // Print result
            System.out.println("The equivalent decimal number for hexadecimal '" + inStr + "' is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid hexadecimal string '" + inStr + "'");
        }
    }
}
