package com.lection6.oop1.practicalTasks.numb1;

import com.lection6.oop1.practicalTasks.numb1.Car;

public class Truck extends Car {
    private int id;
    public Truck (){

    }
    public Truck(int id){
        this.id = id;
    }
    @Override
    public String model() {
        return null;
    }

    @Override
    public int maxSpeed() {
        return 0;
    }

    @Override
    public int yearOfManufacture() {
        return 0;
    }
}
