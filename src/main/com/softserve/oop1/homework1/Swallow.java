package com.softserve.oop1.homework1;

class Swallow extends FlyingBirds{
    @Override
    public void fly() {
        System.out.println("Swallow can't fly!");
    }

    @Override
    public void showLayEggs() {
        System.out.println("Swallow can lay eggs!");
    }

    @Override
    public void showFeathers() {
        System.out.println("Swallow has feathers");
    }
}
