package com.softserve.edu.hw07;

public class NoneFlyingBird extends Bird {

    public NoneFlyingBird(String feather, boolean layEggs) {
        super(feather,layEggs);
    }

    @Override
    public String fly() {
        return "This bird can't fly";
    }

}