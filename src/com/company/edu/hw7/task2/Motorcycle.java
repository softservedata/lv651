package com.company.edu.hw7.task2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("This motorcycle is driving. Vrooom");
    }
}
