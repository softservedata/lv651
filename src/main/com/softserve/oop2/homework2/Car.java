package com.softserve.oop2.homework2;

public class Car extends GroundVehicle {
    String model;

    public Car(String model) {
        this.model = model;
        this.passengers = 5;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Better get car for long trip.");
    }

    @Override
    public String toString() {
        return "\nCar: which model is : " + model + ", and can keep this amount of passengers: " + getPassengers()+ ".";
    }
}
