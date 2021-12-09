package com.softserve.oop1.homework1;

class Penguin extends NonFlyingBirds {

    @Override
    public void fly() {
        System.out.println("Penguins can't fly!");
    }

    @Override
    public void showLayEggs() {
        System.out.println("Penguins can lay eggs!");
    }

    @Override
    public void showFeathers() {
        System.out.println("Penguins don't have feathers!");
    }
}
