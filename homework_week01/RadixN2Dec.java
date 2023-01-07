import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        // Declare variables
        int radix;
        String inStr;
        int results;
        // Prompt and read input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        radix = in.nextInt();
        System.out.print("Enter the string: ");
        inStr = in.next();
        in.close();
        try {
            // Convert the string from base radix to base 10
            results = Integer.parseInt(inStr, radix);
            // Print the result
            System.out.println("The equivalent decimal number '" + inStr + "' is: " + results);
        } catch (NumberFormatException e) {
            System.out.println("error: invalid base " + radix + " string '" + inStr + "'");
        }
    }
}
