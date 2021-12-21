package com.softserve.edu.homework5;

import java.util.Arrays;

public abstract class Bird {
    boolean feathers;
    boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Bird{" +
                "feathers=" + feathers +
                ", layEggs=" + layEggs +
                '}';
    }

    public static void main(String[] args) {

        Bird arr[] = {new Eagle(true,true),
                      new Swallow(false,true),
                      new Penguin(false,true),
                      new Chicken(true,true)};
        arr[0].fly();
        arr[1].fly();
        arr[2].fly();
        arr[3].fly();


        System.out.println(Arrays.toString(arr));
    }
}
