package com.oop.collections.mylist;

/**
 * Provide an implementation of th MyList interface
 * test it with the main() function reported below
 */
public class TestApp {
    public static void main(String[] args) {
        MyList l = new MyArrayList();
        l.add("a", 0);
        l.add("a");
        l.add("c", 0);
        l.add("c", 3);
        l.remove(3);

        System.out.println(l.size());
        System.out.println(l);
    }
}
