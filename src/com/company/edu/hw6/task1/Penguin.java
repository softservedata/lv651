package com.company.edu.hw6.task1;

import com.company.edu.hw6.task1.NonFlyingBird;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}
