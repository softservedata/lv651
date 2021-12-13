package com.company.edu.hw6;

public class Swallow extends FlyingBird{
    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
