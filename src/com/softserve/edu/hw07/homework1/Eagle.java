package com.software.edu.hw07.homework1;

public class Eagle extends FlyingBird{
    public Eagle() {
    }

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
