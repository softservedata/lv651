package com.softserve.edu.hw08.task2;

public class Liner extends WaterVehicle {

    int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("This Liner is sailing");
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                ", passengers=" + passengers +
                '}';
    }
}