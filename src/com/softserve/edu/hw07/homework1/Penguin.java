package com.software.edu.hw07.homework1;

public class Penguin extends  NonFlyingBird{
    public Penguin() {
    }

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
