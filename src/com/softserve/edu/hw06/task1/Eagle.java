package com.softserve.edu.hw06.task1;

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
