import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int number1, number2, number3; // The 3 input integers
        int sum, product, min, max; // To compute these
        // Prompt and read inputs as "int"
        Scanner in = new Scanner(System.in); // Scan the keyboard
        System.out.print("Enter 1st integer: ");
        number1 = in.nextInt();
        System.out.print("Enter 2nd integer: ");
        number2 = in.nextInt();
        System.out.print("Enter 3rd integer: ");
        number3 = in.nextInt();
        in.close();
        // Compute sum and product;
        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        // Compute min
        min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        // Compute max
        max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        // Print results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The min is: " + min);
        System.out.println("The max is: " + max);

    }
}
