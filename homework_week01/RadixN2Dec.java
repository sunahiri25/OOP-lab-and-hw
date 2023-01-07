import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        // Declare variables
        int radix;
        String inStr;
        // Prompt and read input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        radix = in.nextInt();
        System.out.print("Enter the string: ");
        inStr = in.next();
        in.close();
        // Print result
        System.out.println("The equivalent decimal number '" + inStr + "' is: " + convertRadixNToDecimal(inStr, radix));
    }

    public static boolean isValidRadixNString(String inStr, int radix) {
        char ch;
        for (int i = 0; i < inStr.length(); i++) {
            ch = inStr.charAt(i);
            if (Character.digit(ch, radix) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int convertRadixNToDecimal(String inStr, int radix) {
        if (!isValidRadixNString(inStr, radix)) {
            return -1;
        }
        int decValue = 0;
        char ch;
        for (int i = 0; i < inStr.length(); i++) {
            ch = inStr.charAt(i);
            decValue = decValue * radix + toDigit(ch, radix);
        }
        return decValue;
    }

    public static int toDigit(char ch, int radix) {
        return Character.digit(ch, radix);
    }
}
