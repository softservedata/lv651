package com.softserve.nested_innerclasses.practical_task1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Car {
    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    public Car(String model, LocalDate dateOfProduction, double engineCapacity, String color, int passengerCapacity, boolean isAirConditioning) {
        model = "";
        dateOfProduction = null;
        engineCapacity = 0;
        color = "";
        passengerCapacity = 0;
        isAirConditioning = true;
    }

    private Car() {

    }

    public static CarBuilder getCar() {
        return new CarBuilder(new Car());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(LocalDate dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
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
                ", dateOfProduction=" + dateOfProduction +
                ", engineCapacity=" + engineCapacity +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", isAirConditioning=" + isAirConditioning +
                '}';
    }

    public static class CarBuilder {
        private Car car;

        private CarBuilder(Car car) {
            this.car = car;
        }

        public CarBuilder addModel() {
            car.model = "Mazda";
            return this;
        }

        public CarBuilder addDateOfProduction() {
            car.dateOfProduction = LocalDate.now();
            return this;
        }

        public CarBuilder addEngineCapacity() {
            car.engineCapacity = 100;
            return this;
        }

        public CarBuilder addColor() {
            car.color = "Red";
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
