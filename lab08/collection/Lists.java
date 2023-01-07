package collection;

import java.util.*;

public class Lists {
    /**
     * Function to insert an element into a list at the beginning
     */
    public static void insertFirst(ArrayList<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.add(0, value);
    }

    /**
     * Function to insert an element into a list at the end
     */
    public static void insertLast(ArrayList<Integer> list, int value) {
        if (list == null) {
            return;
        }
        list.add(value);
    }

    /**
     * Function to replace the 3rd element of a list with a given value
     */
    public static void replace(ArrayList<Integer> list, int value) {
        if (list == null || list.size() < 3) {
            return;
        }
        list.set(2, value);
    }

    /**
     * Function to remove the 3rd element from a list
     */
    public static void removeThird(ArrayList<Integer> list) {
        if (list == null || list.size() < 3) {
            return;
        }
        list.remove(2);
    }

    /**
     * Function to remove the element "666" from a list
     */
    public static void removeEvil(ArrayList<Integer> list) {
        if (list == null) {
            return;
        }
        list.removeIf(i -> i == 666);
    }

    /**
     * Function returning a ArrayList<Integer> containing
     * the first 10 square numbers
     */
    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> squareNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            squareNumbers.add(i * i);
        }
        return squareNumbers;
    }

    /**
     * Function to verify if a list contains a certain value
     */
    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    /**
     * Function to copy a list into another list (without using library functions)
     * Note well: the target list must be emptied before copy
     */
    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.clear();
        for (Integer integer : source) {
            target.add(integer);
        }
    }

    /**
     * Function to reverse the elements of a list
     */
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    /**
     * Function to reverse the elements of a list (without using library functions)
     */
    public static void reverseManual(ArrayList<Integer> list) {
        for (int fidx = 0, lidx = list.size() - 1; fidx < lidx; fidx++, lidx--) {
            int temp = list.get(fidx);
            list.set(fidx, list.get(lidx));
            list.set(lidx, temp);
        }
    }

    /**
     * Function to insert the same value both at the
     * beginning and the end of the same LinkedList
     * Note well: you can use LinkedList specific methods
     */
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}
