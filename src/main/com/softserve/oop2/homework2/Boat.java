package com.softserve.oop2.homework2;

public class Boat extends WaterVehicle {
    int volume;

    public Boat(int volume) {
        this.volume = volume;
        this.passengers = 35;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boats are working just from 8:00am to 2:00pm.");
    }

    @Override
    public String toString() {
        return "\nBoat:  with it's volume " + volume +
                " meters , and passengers capacity is: " + getPassengers() +
                '.';
    }
}
