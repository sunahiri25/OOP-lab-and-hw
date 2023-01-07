import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        // declare constant
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};
        // declare variables
        String inStr;
        StringBuilder outStr = new StringBuilder();

        // prompt and read the input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        inStr = in.next().toLowerCase();
        in.close();
        try {
            for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
                if (inStr.charAt(charIdx) >= '0' && inStr.charAt(charIdx) <= '9') {
                    outStr.append(HEX_BITS[Character.getNumericValue(inStr.charAt(charIdx))]);
                } else {
                    outStr.append(HEX_BITS[inStr.charAt(charIdx) - 87]);
                }
                outStr.append(" ");
            }
            System.out.println("The equivalent binary for hexadecimal '" + inStr + "' is: " + outStr);
        } catch (Exception e) {
            System.out.println("error: invalid hexadecimal string '" + inStr + "'");
        }
    }
}
