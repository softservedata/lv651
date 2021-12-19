package com.software.edu.hw07.homework1;

public class Swallow extends FlyingBird{
    public Swallow() {
    }

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
