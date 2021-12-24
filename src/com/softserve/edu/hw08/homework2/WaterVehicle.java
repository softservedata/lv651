package com.software.edu.hw08.homework2;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle() {
    }
    public abstract void isSalling();

    @Override
    public String toString() {
        return "WaterVehicle{" +
                "passengers=" + passengers +
                '}';
    }
}
