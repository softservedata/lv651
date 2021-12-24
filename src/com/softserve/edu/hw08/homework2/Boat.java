package com.software.edu.hw08.homework2;

public class Boat extends WaterVehicle {
    private int volume;


    public Boat(int volume) {
        this.volume = volume;
        this.passengers = 5;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSalling() {
        System.out.println("Boats are working just from 9:00am to 5:00pm.");

    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                ", passengers=" + passengers +
                '}';
    }
}