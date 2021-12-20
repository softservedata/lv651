package com.softserve.edu.hw06.task1;

public class Penguin extends NonFlyingBird{
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
