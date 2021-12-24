package com.software.edu.hw08.homework2;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
        this.passengers = 230;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Every morning flying at 11:00am.");
    }

    @Override
    public void land() {
        System.out.println("Landing at 2:30pm, if weather is good.");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "passengers=" + passengers +
                ", maxDistance=" + maxDistance +
                '}';
    }
}
