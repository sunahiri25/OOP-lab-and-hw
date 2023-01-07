package com.patterns.singleton.example;

public class DemoBall {
    public static void main(String[] args) {
        Ball ball = Ball.getInstance("red");
        System.out.println(ball.getColor());

        Ball ball1 = Ball.getInstance("green");
        System.out.println(ball1.getColor());

        Ball ball2 = Ball.getInstance("green");
        System.out.println(ball1 == ball2);

    }
}
