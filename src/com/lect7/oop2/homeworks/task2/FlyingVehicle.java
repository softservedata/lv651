package com.lect7.oop2.homeworks.task2;

public class FlyingVehicle extends Passengers implements Vehicle{
    public FlyingVehicle (){

    }

    public void fly (){
        System.out.println("Flying thing is fly.");
    }
    public void land(){
        System.out.println("Land? ");
    }

    @Override
    public void itsME() {
        System.out.println("public void itsME() || FlyingVehicle");
    }
}
