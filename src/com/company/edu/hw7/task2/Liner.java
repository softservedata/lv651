package com.company.edu.hw7.task2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int floors) {
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing(){
        System.out.println("This liner is sailing");
    }
}
