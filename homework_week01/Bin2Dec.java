import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        // Declare variables
        String inStr;
        int result;
        // Prompt and read input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Binary string: ");
        inStr = in.next();
        in.close();
        try {
            // Convert input binary string into its equivalent decimal number
            result = Integer.parseInt(inStr, 2);
            // Print result
            System.out.println("The equivalent decimal number for binary '" + inStr + "' is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid binary string '" + inStr + "'");
        }
    }
}
