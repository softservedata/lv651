package com.softserve.edu.hw06.task1;

public class FlyingBird extends Bird{

    @Override
    public void fly() {
        System.out.println("You can fly!");
    }
    public FlyingBird(Boolean feathers, Boolean layEggs) {
        super(feathers, layEggs);
    }
}
