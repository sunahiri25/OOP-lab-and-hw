import java.util.Scanner;

public class PrintArray {
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
        // Print array contents, need to handle first item and subsequent items differently
        System.out.print("The values are: [");
        for (int i = 0; i < items.length; i++) {
            if (i == 0) {
                // Print the first item
                System.out.print(items[i]);
            } else {
                // Print the subsequent items
                System.out.print(", " + items[i]);
            }
        }
        System.out.print("]");
    }
}
