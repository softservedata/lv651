package com.lect7.oop2.homeworks.task2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;
    public Motorcycle(){

    }

    @Override
    public void drive() {
        System.out.println("Motorcycle is drive"+maxSpeed);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
