import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        // Declare variables
        String inStr;
        int result;
        // Prompt and read input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Octal string: ");
        inStr = in.next();
        in.close();
        try {
            // Convert input octal string into its equivalent decimal number
            result = Integer.parseInt(inStr, 8);
            // Print result
            System.out.println("The equivalent decimal number for octal '" + inStr + "' is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid octal string '" + inStr + "'");
        }
    }
}
