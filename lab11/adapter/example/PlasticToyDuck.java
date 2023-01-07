package com.patterns.adapter.example;

public class PlasticToyDuck implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("Squeak");
    }
}
