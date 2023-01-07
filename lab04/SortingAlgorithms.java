public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] arr1 = {9, 6, 4, 1, 5};
        selectionSort(arr1);
        print(arr1); // [1, 4, 5, 6, 9]

        int[] arr2 = {9, 2, 4, 1, 5};
        bubbleSort(arr2);
        print(arr2); // [1, 2, 4, 5, 9]

        int[] arr3 = {9, 6, 4, 1, 5, 2, 7};
        insertionSort(arr3);
        print(arr3); // [1, 2, 4, 5, 6, 7, 9]
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, minIndex(array, i));
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; ++i) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[j + 1] < array[j]) {
                    swap(array, j + 1, j);
                }
                print()
            }
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int minIndex(int[] array, int fromIdx) {
        int min = array[fromIdx];
        int minIdx = fromIdx;
        for (int i = fromIdx + 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIdx = i;
            }
        }
        return minIdx;
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
        System.out.print("]\n");
    }
}
