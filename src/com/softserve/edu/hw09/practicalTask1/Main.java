package com.software.edu.hw09.practicalTask1;

public class Main {
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
