package com.softserve.oop1.homework1;

class Eagle extends FlyingBirds{
    @Override
    public void fly() {
        System.out.println("Eagle can fly!");
    }

    @Override
    public void showLayEggs() {
        System.out.println("Eagle can lay eggs!");
    }

    @Override
    public void showFeathers() {
        System.out.println("Eagle has feathers");
    }
}
