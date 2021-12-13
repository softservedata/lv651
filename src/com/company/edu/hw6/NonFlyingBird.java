package com.company.edu.hw6;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String Fly() {
        return "This bird can`t fly";
    }
}
