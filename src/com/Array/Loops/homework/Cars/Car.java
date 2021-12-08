package com.Array.Loops.homework.Cars;

public class Car {
    private int year;
    private double capacity;
    public Car(int year, double capacity){
        this.capacity = capacity;
        this.year = year;
    }

    public String thisCarOnDizel (boolean isCarDiezel){
//        if (isCarDiezel){
//            return "This is diezel car";
//        } else {
//            return "This isn`t diezl car";
//        }
        return (isCarDiezel)
                ? "This is diezel car"
                : "This isn`t diezl car";
    }
    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", capacity=" + capacity +
                '}';
    }
}
