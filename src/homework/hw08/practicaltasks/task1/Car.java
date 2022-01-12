package homework.hw08.practicaltasks.task1;

import java.time.LocalDate;

public class Car {

    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    public Car() {
    }

    public static CarBuilder getCar() {
        return new CarBuilder(new Car());
    }

    public static class CarBuilder {

        private Car car;

        public CarBuilder(Car car) {
            this.car = car;
        }

        public CarBuilder addModel(String model) {
            car.model = model;
            return this;
        }
        public CarBuilder addDateOfProduction() {
            car.dateOfProduction = LocalDate.now();
            return this;
        }

        public CarBuilder addEngineCapacity(double engineCapacity) {
            car.engineCapacity = engineCapacity;
            return this;
        }

        public CarBuilder addColor(String color) {
            car.color = color;
            return this;
        }

        public CarBuilder addPassengerCapacity(int passengerCapacity) {
            car.passengerCapacity = passengerCapacity;
            return this;
        }

        public CarBuilder setAirConditioningTrue() {
            car.isAirConditioning = true;
            return this;
        }

        public CarBuilder setAirConditioningFalse() {
            car.isAirConditioning = false;
            return this;
        }

        public Car build() {
            return this.car;
        }

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
}
