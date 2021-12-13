package com.softserve.oop2.homework2;

public class Liner extends WaterVehicle {

    int floors;

    public Liner(int floors) {
        this.floors = floors;
        this.passengers = 300;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Always ready to sail at any time!");
    }

    @Override
    public String toString() {
        return "Liner: it has this amount of floors " + floors +
                ", and can keep this amount of passengers: " + getPassengers();
    }
}
