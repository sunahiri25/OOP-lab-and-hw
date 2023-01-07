import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        // Declare variables
        String inStr;
        // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        inStr = in.next().toLowerCase();
        in.close();
        // Print results
        System.out.print("The sequence of keypad digits: ");
        using_nested_if(inStr);
        // using_switch_case_default(inStr);
    }

    public static void using_nested_if(String str) {
        int digit = 0;
        for (int charIdx = 0; charIdx < str.length(); charIdx++) {
            char tempChar = str.charAt(charIdx);
            if (tempChar == 'a' || tempChar == 'b' || tempChar == 'c') {
                digit = 2;
            } else if (tempChar == 'd' || tempChar == 'e' || tempChar == 'f') {
                digit = 3;
            } else if (tempChar == 'g' || tempChar == 'h' || tempChar == 'i') {
                digit = 4;
            } else if (tempChar == 'j' || tempChar == 'k' || tempChar == 'l') {
                digit = 5;
            } else if (tempChar == 'm' || tempChar == 'n' || tempChar == 'o') {
                digit = 6;
            } else if (tempChar == 'p' || tempChar == 'q' || tempChar == 'r' || tempChar == 's') {
                digit = 7;
            } else if (tempChar == 't' || tempChar == 'u' || tempChar == 'v') {
                digit = 8;
            } else if (tempChar == 'w' || tempChar == 'x' || tempChar == 'y' || tempChar == 'z') {
                digit = 9;
            }
            System.out.print(digit);
        }
    }

    public static void using_switch_case_default(String str) {
        int digit = 0;
        for (int charIdx = 0; charIdx < str.length(); charIdx++) {
            switch (str.charAt(charIdx)) {
                case 'a':
                case 'b':
                case 'c':
                    digit = 2;
                    break;
                case 'd':
                case 'e':
                case 'f':
                    digit = 3;
                    break;
                case 'g':
                case 'h':
                case 'i':
                    digit = 4;
                    break;
                case 'j':
                case 'k':
                case 'l':
                    digit = 5;
                    break;
                case 'm':
                case 'n':
                case 'o':
                    digit = 6;
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    digit = 7;
                    break;
                case 't':
                case 'u':
                case 'v':
                    digit = 8;
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    digit = 9;
                    break;
            }
            System.out.print(digit);
        }
    }
}
