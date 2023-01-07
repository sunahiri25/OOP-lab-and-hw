public class MethodOverloading {
    public static void main(String[] args) {
        // declare variables
        int[] arr1, arr2, arr3;
        // write test driver
        arr1 = new int[]{};
        arr2 = new int[]{4};
        arr3 = new int[]{1, 2, 3};
        // print results
        System.out.println("The values are: ");
        print(arr1); // []
        System.out.println();
        print(arr2); // [4]
        System.out.println();
        print(arr3); // [1, 2, 3]
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
    }

    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
    }

    public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(", " + array[i]);
            }
        }
        System.out.print("]");
    }
}
