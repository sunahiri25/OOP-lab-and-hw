import java.util.Scanner;

public class TriangularPatternB {
    public static void main(String[] args) {
        // Define variables
        int size;
        // Prompt and read input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        in.close();
        for (int row = size; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("# ");
            }
            System.out.println();
        }
        String format = "%" + size + "s";
        System.out.printf(format, "(b)");
    }
}
