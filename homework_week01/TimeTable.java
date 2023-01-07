import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        // Declare variables
        int size;
        // Prompt and read input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size: ");
        size = in.nextInt();
        in.close();
        for (int row = 0; row <= size + 1; row++) {
            for (int col = 0; col <= size; col++) {
                if (row == 0) {
                    if (col == 0) {
                        System.out.printf("%-4s|", "*");
                    } else {
                        System.out.printf("%4d", col);
                        if (col == size) {
                            System.out.println();
                        }
                    }
                } else if (row == 1) {
                    System.out.print("----");
                } else if (col == 0) {
                    System.out.printf("\n%-4d|", row - 1);
                } else {
                    System.out.printf("%4d", (row - 1) * col);
                }
            }
        }
    }
}
