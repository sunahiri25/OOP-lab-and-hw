import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        // Declare constants
        final int SENTINEL = -1;
        // declare variables
        int number;
        int sum = 0;
        // Read first input to "seed" the while loop
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the positive integer (or -1 to end): ");
        number = in.nextInt();
        while (number != SENTINEL) {
            if (hasEight(number)) {
                sum += number;
            }
            System.out.print("Enter the positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        System.out.println("The magic sum is: " + sum);
    }

    public static boolean hasEight(int number) {
        while (number > 0) {
            if (number % 10 == 8) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}