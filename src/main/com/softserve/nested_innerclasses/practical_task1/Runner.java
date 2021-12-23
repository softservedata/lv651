package com.softserve.nested_innerclasses.practical_task1;

public class Runner {
    public static void main(String[] args) {
        Car car = Car.getCar()
                .addModel()
                .addColor()
                .addEngineCapacity()
                .addPassengerCapacity()
                .addDateOfProduction()
                .setAirConditioning().build();
        System.out.println(car);
    }
}
