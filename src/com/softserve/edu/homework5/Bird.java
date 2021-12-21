package com.softserve.edu.homework5;

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

        Bird eagle = new Eagle(true,true);
        Bird swallow = new Swallow(false,true);
        Bird penguin = new Penguin(false,true);
        Bird chicken = new Chicken(true,true);

        Bird arr[] = {eagle, swallow, penguin, chicken};

        eagle.fly();
        swallow.fly();
        penguin.fly();
        chicken.fly();

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
