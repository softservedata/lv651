package com.lect7.oop2.homeworks.task2;

public class Liner extends WaterVehicle{
    private int floors;
    public Liner(){

    }

    public void isSailing(){
        System.out.println("Liner is Sailing.");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
