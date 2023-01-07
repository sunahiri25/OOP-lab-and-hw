import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        // Declare variables
        final int NUM_ITEMS;
        int[] items;
        // Prompt for the number of items and read the input as "int"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        // Allocate the array
        items = new int[NUM_ITEMS];
        // Prompt and read the items into the "int" array, if array length > 0
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
        }
        in.close();
        // Print array in "index: number of stars" using a nested-loop
        for (int idx = 0; idx < items.length; idx++) {
            System.out.print(idx + ": ");
            // Print value as the number of stars
            for (int starNo = 1; starNo <= items[idx]; ++starNo) {
                System.out.print("*");
            }
            System.out.print("(" + items[idx] + ")");
            System.out.println();
        }
    }
}
