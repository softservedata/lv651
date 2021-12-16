package com.lect7.oop2.homeworks.task2;

public class Boat extends WaterVehicle{
    private int volume;
    public Boat(){

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void isSailing(){
        System.out.println("Boat is Sailing "+ volume);
    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                '}';
    }
}
