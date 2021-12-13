package com.softserve.oop2.homework2;

public class Plane extends FlyingVehicle{
    int maxDistance;

    public Plane(int maxDistance) {
        this.maxDistance = maxDistance;
        this.passengers = 450;
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
        return "\nPlane: max distance to fly one way is: " + maxDistance +
                " km and can keep this amount of passengers: " + getPassengers() + ".";
    }
}
