package com.software.edu.hw08.homework2;

public class Helicopter extends FlyingVehicle{
    private int weight, maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
        this.passengers = 4;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public void fly() {
        System.out.println("Work hours just on weekends.From 8am to 8pm");

    }

    @Override
    public void land() {

    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "weight=" + weight +
                ", maxHeight=" + maxHeight +
                ", passengers=" + passengers +
                '}';
    }
}
