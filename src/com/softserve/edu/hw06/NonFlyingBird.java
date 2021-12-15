package com.softserve.edu.hw06;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String feather, boolean layEggs) {
        super(feather,layEggs);
    }

    @Override
    public String fly() {
        return "This bird can't fly";
    }

}
