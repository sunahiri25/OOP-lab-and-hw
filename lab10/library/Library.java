package com.oop.library;

import java.util.ArrayList;
import java.util.Collections;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        ArrayList<Long> diffTime = new ArrayList<>();
        for (Rent r : rents) {
            diffTime.add(r.getEnd().getTime() - r.getBegin().getTime());
        }
        long maxDiff = 0;
        Rent longestRent = null;
        for (int i = 0; i < diffTime.size(); i++) {
            if (maxDiff < diffTime.get(i)) {
                maxDiff = diffTime.get(i);
                longestRent = rents[i];
            }
        }
        return longestRent;
    }
}
