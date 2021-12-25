package com.softserve.edu.homework6.HW2;

public class Car extends GroundVehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    void drive() {
    }
}
