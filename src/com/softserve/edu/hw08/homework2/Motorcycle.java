package com.software.edu.hw08.homework2;

public class Motorcycle extends GroundVehicle{

    private int maxSpeed;

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
    public void drive(){
        System.out.println("Motorcycle is fast, be careful.");

    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                ", passengers=" + passengers +
                '}';
    }
}
