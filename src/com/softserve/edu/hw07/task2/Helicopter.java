package com.softserve.edu.hw07.task2;

public class Helicopter extends FlyingVehicle {
int weight;
int MaxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        MaxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("This helicopter is flying.");;
    }

    @Override
    public void land() {
        System.out.println("Helicopter is landing.");;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "weight=" + weight +
                ", MaxHeight=" + MaxHeight +
                ", passengers=" + passengers +
                '}';
    }
}
