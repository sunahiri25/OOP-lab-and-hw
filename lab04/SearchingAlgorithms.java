public class SearchingAlgorithms {
    public static boolean linearSearch(int[] array, int key) {
        for (int x : array) {
            if (x == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        if (linearSearch(array, key)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == key) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            return key == array[fromIdx];
        }
        while (fromIdx != toIdx) {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int key) {
        int firstIdx = 0;
        int lastIdx = array.length - 1;
        if (firstIdx == lastIdx - 1) {
            return key == array[firstIdx];
        }
        while (firstIdx != lastIdx) {
            int middleIdx = (firstIdx + lastIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                lastIdx = middleIdx;
            } else {
                firstIdx = middleIdx + 1;
            }
        }
        return false;
    }
}
