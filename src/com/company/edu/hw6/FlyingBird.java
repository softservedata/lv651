package com.company.edu.hw6;

public class FlyingBird extends Bird{
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String Fly() {
        return "This bird can fly";
    }

}
