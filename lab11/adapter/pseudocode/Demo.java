package com.patterns.adapter.pseudocode;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println(hole.fits(rpeg));

        SquarePeg smallSqPeg = new SquarePeg(5);
        SquarePeg largeSqPeg = new SquarePeg(10);
//        System.out.println(hole.fits(smallSqPeg));

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        System.out.println(hole.fits(smallSqPegAdapter));
        System.out.println(hole.fits(largeSqPegAdapter));
    }
}
