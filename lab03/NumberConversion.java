import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        // declare variables
        String inStr;
        int inRadix, outRadix;

        // prompt and read inputs
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        inStr = in.next();
        System.out.print("Enter the input radix: ");
        inRadix = in.nextInt();
        System.out.print("Enter the output radix: ");
        outRadix = in.nextInt();
        in.close();

        // print result
        System.out.printf("'%s' in radix %d is '%s' in radix %d", inStr, inRadix, toRadix(inStr, inRadix, outRadix), outRadix);
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        int decValue;
        if (inRadix != 10) {
            decValue = convertToDecimal(in, inRadix);
        } else decValue = Integer.parseInt(in);
        if (outRadix == 10) {
            return String.valueOf(decValue);
        }
        return convertFromDecimal(decValue, outRadix);
    }

    public static boolean isValidString(String inStr, int inRadix) {
        char ch;
        for (int i = 0; i < inStr.length(); i++) {
            ch = inStr.charAt(i);
            if (Character.digit(ch, inRadix) == -1) {
                return false;
            }
        }
        return true;
    }

    public static int convertToDecimal(String inStr, int inRadix) {
        if (!isValidString(inStr, inRadix)) {
            return -1;
        }
        int decValue = 0;
        char ch;
        for (int i = 0; i < inStr.length(); i++) {
            ch = inStr.charAt(i);
            decValue = decValue * inRadix + Character.digit(ch, inRadix);
        }
        return decValue;
    }

    public static String convertFromDecimal(int decValue, int outRadix) {
        StringBuilder out = new StringBuilder();
        while (decValue > 0) {
            int temp = decValue % outRadix;
            if (temp <= 9) {
                out.insert(0, temp);
            } else {
                out.insert(0, (char) (temp + 55));
            }
            decValue /= outRadix;
        }
        return String.valueOf(out);
    }

}
