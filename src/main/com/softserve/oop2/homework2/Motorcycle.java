package com.softserve.oop2.homework2;

public class Motorcycle extends GroundVehicle{
    int maxSpeed;

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.passengers = 2;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is fast, be careful.");
    }

    @Override
    public String toString() {
        return "\nMotorcycle: which is max speed is: " + maxSpeed + ", and can keep this amount of passengers: " + getPassengers()+ ".";
    }
}
