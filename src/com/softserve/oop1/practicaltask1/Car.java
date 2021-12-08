package com.softserve.oop1.practicaltask1;

public abstract class Car {
    public String model;
    public int maxSpeed;
    public int yearOfManifacture;

    public void run() {
        System.out.println("The car is running!");
    }

    public void stop() {
        System.out.println("The car stopped!");
    }

    public Car(String model, int maxSpeed, int yearOfManifacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManifacture = yearOfManifacture;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfManifacture() {
        return yearOfManifacture;
    }
}
