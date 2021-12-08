package com.softserve.arraysloops.homework;

public class Car {
    private String type;
    private int yearProduction;
    private int engineCapacity;

    public Car(String type, int yearProduction, int engineCapacity) {
        this.type = type;
        this.yearProduction = yearProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}
