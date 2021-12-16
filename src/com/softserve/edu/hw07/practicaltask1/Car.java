package com.software.edu.hw07.practicaltask1;
import java.util.Arrays;

public abstract class Car {
    public String model;
    public int maxSpeed, yearOfManufacture;

    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    public void run(){
        System.out.println("The car is running!");
    }

    public void stop(){
        System.out.println("The car is stopped!");

    }
    private static Truck truck1 = new Truck("MAN TGX 18.440",90,2009);
    private static Sedan sedan1 = new Sedan("Maruti Dzire",155,2016);
    private static Truck truck2 = new Truck("Ram 1500 Classic",210,2015);
    private static Sedan sedan2 = new Sedan("Honda City",197,2020);
    private static Sedan sedan3 = new Sedan("Hyundai Aura",155,2020);

    public static void main(String[] args) {

        Car [] cars= new Car[]{sedan1,sedan2,sedan3,truck1,truck2};

        for(int i = 0; i<cars.length; i++){
            if(cars[i] instanceof Truck){
                System.out.println(cars[i]);
            }
        }
        for(int i = 0; i<cars.length; i++){
            if(cars[i] instanceof Sedan){
                System.out.println(cars[i]);

            }
        }

    }

}
