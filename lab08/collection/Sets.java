package collection;

import java.util.*;

public class Sets {
    /**
     * Function returning the intersection of two given sets
     * (without using library functions)
     */
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (int i : first) {
            if (second.contains(i)) {
                intersection.add(i);
            }
        }
        return intersection;
    }

    /**
     * Function returning the union of two given sets
     * (without using library functions)
     */
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>();
        for (Integer fSet : first) {
            union.add(fSet);
        }
        for (int i : second) {
            if (!first.contains(i)) {
                union.add(i);
            }
        }
        return union;
    }

    /**
     * Function returning the intersection of two given sets
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    /**
     * Function returning the union of two given sets
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    /**
     * Function to transform a set into a list without duplicates
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    /**
     * Function to remove duplicates from a list
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> sourceSet = new HashSet<>(source);
        return new ArrayList<>(sourceSet);

    }

    /**
     * Function to remove duplicates from a list
     * without using the constructors trick seen above
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int element : source) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    /**
     * Function accepting a string s
     * returning the first recurring character
     * For example firstRecurringCharacter("abaco") -> a.
     */
    public static String firstRecurringCharacter(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        Set<Character> strSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (strSet.contains(s.charAt(i))) {
                return s.charAt(i) + "";
            } else {
                strSet.add(s.charAt(i));
            }
        }
        return null;
    }

    /**
     * Function accepting a string s
     * returning a set comprising all recurring characters
     * For example allRecurringCharacters("mamma") -> [m, a].
     */
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> charsRes = new HashSet<>();
        Set<Character> noDuplicateChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (noDuplicateChars.contains(s.charAt(i))) {
                charsRes.add(s.charAt(i));
            } else {
                noDuplicateChars.add(s.charAt(i));
            }
        }
        return charsRes;
    }

    /**
     * Function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    /**
     * Function to return the first item from a TreeSet
     * Note well: Use TreeSet specific methods
     */
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    /**
     * Function to return the last item from a TreeSet
     * Note well: Use TreeSet specific methods
     */
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    /**
     * Function to get an element from a TreeSet
     * which is strictly greater than a given element
     * Note well: use TreeSet specific methods
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }

}
