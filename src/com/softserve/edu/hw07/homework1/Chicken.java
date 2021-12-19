package com.software.edu.hw07.homework1;

public class Chicken extends NonFlyingBird{

    public Chicken() {
    }

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
