package com.software.edu.hw07.homework1;

public class FlyingBird extends Bird{
    public FlyingBird() {
    }

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String fly(){
    return "This bird can fly";
    }
}
