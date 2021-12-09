package com.softserve.oop1.homework1;

public class NonFlyingBirds extends Bird {

    @Override
    public void fly() {
        System.out.println("These are non-flying birds: ");
    }

    @Override
    public void showLayEggs() {
        System.out.println("These birds can lay eggs: ");
    }

    @Override
    public void showFeathers() {
        System.out.println("These birds have feathers: ");
    }


}

