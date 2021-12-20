package com.softserve.edu.hw06.task1;

public class Swallow extends  FlyingBird{

    public Swallow (String feather,boolean layEggs){
        super(feather, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feather='" + feather + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
