import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args) {
        // Declare variables
        int size;
        // Prompt and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        in.close();
        // Outer loop to print each of the rows
        for (int row = 1; row <= size; row++) {
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {
                if ((row % 2) == 0) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            // Print a newline after printing all the columns
            System.out.println();
        }

    }
}
