package com.company.edu.hw7.task2;

public class Car extends GroundVehicle{
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("This car is riding");
    }
}
