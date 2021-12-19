package com.software.edu.hw07.homework1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird() {
    }

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    String fly() {
        return "This bird can't fly";
    }
}
