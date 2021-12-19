package HW08.PracticalTask.PT1;

import java.time.LocalDate;

public class Car {
    private String model;
    private LocalDate dateOfProduction;
    private double engineCapacity;
    private String color;
    private int passengerCapacity;
    private boolean isAirConditioning;

    private Car(){}

    public static CarBuilder getCar(){
        return new CarBuilder();
    }

    public static class CarBuilder {
        public CarBuilder() {

        }
        void addModel(String mmodel){
            //model = mmodel;
        }

    }

}
