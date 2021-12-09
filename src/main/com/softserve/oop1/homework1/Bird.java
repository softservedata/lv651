package com.softserve.oop1.homework1;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    public abstract void fly();

    public abstract void showLayEggs();

    public abstract void showFeathers();

    public static void main(String[] args) {
        Bird[] birdsArr = new Bird[]{new Chicken(), new Penguin(), new Eagle(), new Swallow()};

        for (Bird birds : birdsArr) {
            birds.fly();
            birds.showFeathers();
            birds.showLayEggs();
        }

    }
}
