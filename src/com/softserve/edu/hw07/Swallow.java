package com.softserve.edu.hw07;

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