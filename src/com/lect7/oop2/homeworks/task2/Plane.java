package com.lect7.oop2.homeworks.task2;

public class Plane extends FlyingVehicle{
    private int maxDistance;
    public Plane (){

    }

    public void fly (){
        System.out.println("Plane is flying.");
    }

    @Override
    public void land() {
        System.out.println("Land? plane.");
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "maxDistance=" + maxDistance +
                '}';
    }
}
