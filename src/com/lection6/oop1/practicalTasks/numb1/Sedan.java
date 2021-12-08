package com.lection6.oop1.practicalTasks.numb1;

import com.lection6.oop1.practicalTasks.numb1.Car;

public class Sedan extends Car {
    private int id;
    public Sedan(){

    }
    public Sedan(int id){
        this.id = id;
        return;
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
