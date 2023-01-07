package com.patterns.singleton.pseudocode;

public class Application {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        database.query("SELECT * FROM K66A5");

        Database database1 = Database.getInstance();
        database1.query("SELECT * FROM K66A3");

        System.out.println(database == database1);
    }
}
