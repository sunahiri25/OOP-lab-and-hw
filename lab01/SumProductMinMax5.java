import java.util.Scanner;

public class SumProductMinMax5 {
    public static void main(String[] args) {
        int number1, number2, number3, number4, number5; // The 5 input integers
        int sum, product, min, max; // To compute these
        // Prompt and read inputs as "int"
        Scanner in = new Scanner(System.in); // Scan the keyboard
        System.out.print("Enter 1st integer: ");
        number1 = in.nextInt();
        System.out.print("Enter 2nd integer: ");
        number2 = in.nextInt();
        System.out.print("Enter 3rd integer: ");
        number3 = in.nextInt();
        System.out.print("Enter 4th integer: ");
        number4 = in.nextInt();
        System.out.print("Enter 5th integer: ");
        number5 = in.nextInt();
        in.close();
        // Compute sum and product;
        sum = number1 + number2 + number3 + number4 + number5;
        product = number1 * number2 * number3 * number4 * number5;
        // Compute min
        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        }
        if (number5 < min) {
            min = number5;
        }
        // Compute max
        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number4 > max) {
            max = number4;
        }
        if (number5 > max) {
            max = number5;
        }
        // Print results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);
    }
}
