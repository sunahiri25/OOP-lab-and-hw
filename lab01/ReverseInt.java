import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        // Declare variables
        int inNumber;
        int inDigit;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        inNumber = in.nextInt();
        // Extract and drop the last digit repeatably using a while-loop with modulus/divide operations
        System.out.print("The reverse is: ");
        while (inNumber > 0) {
            inDigit = inNumber % 10;
            // Print this digit
            System.out.print(inDigit);
            inNumber /= 10; // drop last digit and repeat
        }
    }
}
