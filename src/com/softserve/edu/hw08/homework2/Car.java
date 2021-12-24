package com.software.edu.hw08.homework2;

public class Car extends GroundVehicle{
    private String model;

    public Car(String model) {
        this.model = model;
        this.passengers = 4;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive(){
        System.out.println("Better get car for long trip");
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
