package com.softserve.oop1.homework1;

class Chicken extends NonFlyingBirds {

    public void fly() {
        System.out.println("Chicken can't fly!");
    }

    @Override
    public void showLayEggs() {
        System.out.println("Chicken can lay eggs!");
    }

    @Override
    public void showFeathers() {
        System.out.println("Chicken has feathers!");
    }

}
