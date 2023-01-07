import java.util.Arrays;

public class ExercisesOnMethod {
    public static void main(String[] args) {
        // declare variables
        int[] arr1, arr2, arr3, arr4, arr5;
        // write test driver
        arr1 = new int[]{};
        arr2 = new int[]{4};
        arr3 = new int[]{1, 2, 3};
        arr4 = new int[]{2, 3, 4};
        arr5 = new int[]{3, 1, 2};
        // print results
        System.out.println(arrayToString(arr1)); // []
        System.out.println(arrayToString(arr2)); // [4]
        System.out.println(arrayToString(arr3)); // [1, 2, 3]

        System.out.println(contains(arr3, 2)); // true
        System.out.println(contains(arr3, 5)); // false

        System.out.println(search(arr3, 2)); // 1
        System.out.println(search(arr3, 6)); // -1

        System.out.println(equals(arr2, arr3)); // false
        System.out.println(equals(arr3, arr4)); // false
        System.out.println(equals(arr3, arr5)); // true

        System.out.println(arrayToString(copyOf(arr5))); // [3, 1, 2]
        System.out.println(arrayToString(copyOf(arr4, 6))); // [2, 3, 4, 0, 0, 0]

        System.out.println(swap(arr1, arr2)); // false
        System.out.println(swap(arr4, arr5)); // true

        reverse(arr3);
        System.out.println(arrayToString(arr3)); // [3, 2, 1]
    }

    // return a String in the form of [a1, a2, . . . , an]
    public static String arrayToString(int[] array) {
        StringBuilder outStr = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                outStr.append(array[i]);
            } else {
                outStr.append(", ").append(array[i]);
            }
        }
        outStr.append("]");
        return String.valueOf(outStr);
    }

    // return true if the array contains the given int
    public static boolean contains(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    // return the array index if the array contains the given int; or −1 otherwise
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // return true if the two arrays are exactly the same
    public static boolean equals(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        int[] arr1 = copyOf(array1);
        int[] arr2 = copyOf(array2);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // return a copy of the given array
    public static int[] copyOf(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] newArr = new int[newLength];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }

    // return true if the contents of two int arrays are successfully swapped
    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    // reverse int[] contents
    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
    }
}
