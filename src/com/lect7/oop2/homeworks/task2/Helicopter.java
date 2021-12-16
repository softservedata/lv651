package com.lect7.oop2.homeworks.task2;

public class Helicopter extends FlyingVehicle{
    private int weight;
    private int maxHeight;

    public Helicopter(){

    }

    @Override
    public void fly() {
        System.out.println("Helic is flying.");
    }

    @Override
    public void land() {
        System.out.println("Land? helicopter.");
    }
}
