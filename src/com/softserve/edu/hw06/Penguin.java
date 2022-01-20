package com.softserve.edu.hw06;

public class Penguin extends NoneFlyingBird{
    public Penguin(String feathers, boolean layEggs){
        super(feathers,layEggs);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feather='" + feather + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
