package com.softserve.edu.hw08.task2;

public class Boat extends WaterVehicle{

    int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("This boat is sailing");
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                ", passengers=" + passengers +
                '}';
    }
}
