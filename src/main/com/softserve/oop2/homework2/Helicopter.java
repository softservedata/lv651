package com.softserve.oop2.homework2;

public class Helicopter extends FlyingVehicle{

    int weight;
    int maxHeight;

    public Helicopter(int weight, int maxHeight) {
        this.weight = weight;
        this.maxHeight = maxHeight;
        this.passengers = 6;
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
        System.out.println("Work hours just on weekends.From 8am to 8pm.");
    }

    @Override
    public void land() {
        System.out.println("Landing after one hour of flying.");
    }

    @Override
    public String toString() {
        return "\nHelicopter: with it's weight: " + weight + " tones and max height: " + maxHeight + " meters. " +
                "Can keep that amount of passsengers: " + getPassengers() + ".";
    }
}
