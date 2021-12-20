package com.softserve.edu.hw06.task1;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feather, boolean layEggs) {
        super(feather,layEggs);
    }

    @Override
    public String fly() {
        return "This bird can't fly";
    }

}
