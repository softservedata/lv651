package com.softserve.edu.hw07;

public class Eagle extends  FlyingBird{
    public Eagle(String feather, boolean layEggs){
        super (feather,layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feather='" + feather + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}