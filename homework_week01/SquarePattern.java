import java.util.Scanner;

public class SquarePattern {
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
                System.out.print("# ");
            }
            // print a newline after printing all the columns
            System.out.println();

        }
    }

    public static void using_while_do_loops(int size) {
        int row = 1;
        while (row <= size) {
            int col = 1;
            while (col <= size) {
                System.out.print("# ");
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
