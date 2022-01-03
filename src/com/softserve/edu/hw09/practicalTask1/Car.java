package com.software.edu.hw09.practicalTask1;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dataOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    public Car(String model, LocalDate dataOfProduction, double engineCapacity, String color, int passengerCapacity, boolean isAirConditioning) {
        this.model = model;
        this.dataOfProduction = dataOfProduction;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.passengerCapacity = passengerCapacity;
        this.isAirConditioning = isAirConditioning;
    }

    private Car(){

    }
    public static CarBuilder getCar(){
        return new CarBuilder(new Car());


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDataOfProduction() {
        return dataOfProduction;
    }

    public void setDataOfProduction(LocalDate dataOfProduction) {
        this.dataOfProduction = dataOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public boolean isAirConditioning() {
        return isAirConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        isAirConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", dataOfProduction=" + dataOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }

    public static class CarBuilder{
        private Car car;
        public CarBuilder(Car car) {
            this.car = car;
        }
        public CarBuilder addModel() {
            car.model = "BMW";
            return this;
        }
        public CarBuilder addDateOfProduction() {
            car.dataOfProduction = LocalDate.now();
            return this;
        }

        public CarBuilder addEngineCapacity() {
            car.engineCapacity = 100;
            return this;
        }

        public CarBuilder addColor() {
            car.color = "Black";
            return this;
        }

        public CarBuilder addPassengerCapacity() {
            car.passengerCapacity = 5;
            return this;
        }

        public CarBuilder setAirConditioning() {
            car.isAirConditioning = true;
            return this;
        }

        public Car build() {
            return this.car;
        }
    }

}
