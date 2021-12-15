package com.softserve.edu.hw06;

public class Chicken extends NonFlyingBird{

    public Chicken(String feathers, boolean layEggs){
        super(feathers,layEggs);
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feather='" + feather + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }


}
