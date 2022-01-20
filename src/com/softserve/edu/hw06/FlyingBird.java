package com.softserve.edu.hw06;

public class FlyingBird extends Bird {

    public  FlyingBird(String feather, boolean layEggs) {
        super (feather,layEggs);
    }
    @Override
    public String fly() {
        return "This bird can fly";
    }
}