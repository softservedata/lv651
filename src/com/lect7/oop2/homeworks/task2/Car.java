package com.lect7.oop2.homeworks.task2;

public class Car extends GroundVehicle{
    private String model;
    public Car(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Car is drive "+model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
