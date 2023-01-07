public class TestSearchingAlgorithms {
    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {1};
        int[] arr3 = {4, 8, 3, 15};
        int[] arr4 = {11, 15, 18, 20, 31, 45};

        System.out.println(SearchingAlgorithms.linearSearch(arr1, 3)); // false
        System.out.println(SearchingAlgorithms.linearSearch(arr2, 1)); // true
        System.out.println(SearchingAlgorithms.linearSearchIndex(arr3, 15)); // 3
        System.out.println(SearchingAlgorithms.linearSearchIndex(arr3, 6)); // 0
        System.out.println(SearchingAlgorithms.binarySearch(arr4, 31, 0, 3)); // false
        System.out.println(SearchingAlgorithms.binarySearch(arr4, 20)); // true
    }
}
