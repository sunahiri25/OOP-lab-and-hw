package collection;

import java.util.*;

public class Maps {
    /*
    function return the number of key-value mapping of a map
     */
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    /*
    function to remove all mappings from a map
     */
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    /*
    function to test if a map contains a mapping for the specified key
     */
    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    /* function to test if a map contains a mapping for the specified key
    and the specified key and if its value equals the specified value
     */
    public static boolean containKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.get(key) == value;
    }

    /*
    function to return the key set of map
     */
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    /*
    function to return the values of map
     */
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    /*
    function, internally using a map, returning "black",
    "white", or "red" depending on int input value
    "black" = 0, "white" = 1, "red" = 2
     */
    public static String getColor(int value) {
        HashMap<Integer, String> color = new HashMap<>();
        color.put(0, "black");
        color.put(1, "white");
        color.put(2, "red");
        return color.get(value);
    }
}