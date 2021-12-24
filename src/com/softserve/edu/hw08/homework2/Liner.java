package com.software.edu.hw08.homework2;

public class Liner extends WaterVehicle{
    private int floors;

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public Liner(int floors) {
        this.floors = floors;
        this.passengers = 350;
    }

    @Override
    public void isSalling() {
        System.out.println("Always ready to sail at any time!");
    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                ", passengers=" + passengers +
                '}';
    }
}
