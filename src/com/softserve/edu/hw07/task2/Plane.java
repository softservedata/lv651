package com.softserve.edu.hw07.task2;

public class Plane extends FlyingVehicle{
    int maxDistance;

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public void land() {
        System.out.println("This plane is landing.");
    }

    @Override
    public void fly() {
        System.out.println("This plane is flying.");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "passengers=" + passengers +
                ", maxDistance=" + maxDistance +
                '}';
    }
}
