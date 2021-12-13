package com.company.edu.hw6;

public class Chicken extends NonFlyingBird{

    public Chicken(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Chicken{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
