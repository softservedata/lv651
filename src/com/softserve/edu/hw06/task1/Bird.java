package com.softserve.edu.hw06.task1;

import com.softserve.edu.hw5.task4.Car;

public abstract class Bird {

   private Boolean feathers;
   private Boolean layEggs;

    public abstract void fly();

    @Override
    public String toString() {
        return  "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    public Bird(Boolean feathers, Boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;


    }
}
