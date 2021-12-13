package com.softserve.oop2.homework2;

public abstract class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle() {
    }

    public abstract void isSailing();

    @Override
    public String toString() {
        return "WaterVehicle{" +
                "passengers=" + passengers +
                '}';
    }
}
