import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        // declare variables
        int exp;
        int base;

        // prompt and read exponent and base
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        base = in.nextInt();
        System.out.print("Enter the exponent: ");
        exp = in.nextInt();
        in.close();
        // Print result
        System.out.println(base + " raise to the power of " + exp + " is: " + exponent(base, exp));

    }

    public static int exponent(int base, int exp) {
        int product = 1;
        // Multiply product and base for exp number of times
        for (int i = 1; i <= exp; i++) {
            product *= base;
        }
        return product;
    }
}
