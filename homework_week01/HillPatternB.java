import java.util.Scanner;

public class HillPatternB {
    public static void main(String[] args) {
        // Define variables
        int size;
        // Prompt and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        in.close();
        for (int row = size; row >= 1; row--) {
            for (int col = 2 * size - 1; col >= 1; col--) {
                if ((row + col >= size + 1) && (row >= col - size + 1)) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        String format = "%" + 2 * size + "s";
        System.out.printf(format, "(b)");
    }
}
