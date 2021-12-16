package com.lect7.oop2.homeworks.task2;

public class Passengers {
    private int passengers;
    public Passengers(){

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "passengers=" + passengers +
                '}';
    }
}
