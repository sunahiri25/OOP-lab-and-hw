import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        String inStr;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the octal string: ");
        inStr = in.next();
        in.close();
        System.out.println("The equivalent decimal number for octal '" + inStr + "' is: " + convertOctalToDecimal(inStr));
    }

    public static boolean isValidOctalString(String inStr) {
        char ch;
        for (int i = 0; i < inStr.length(); i++) {
            ch = inStr.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static int convertOctalToDecimal(String inStr) {
        int decValue = 0;
        char ch;
        if (!isValidOctalString(inStr)) {
            return -1;
        }
        for (int i = 0; i < inStr.length(); i++) {
            ch = inStr.charAt(i);
            decValue = decValue * 8 + toDigit(ch);
        }
        return decValue;
    }

    public static int toDigit(char ch) {
        return Character.digit(ch, 8);
    }
}
