package com.company.edu.hw7.task2;

public class Plane extends FlyingVehicle{
    private int MaxDistance;

    public Plane(int maxDistance) {
        MaxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return MaxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        MaxDistance = maxDistance;
    }
@Override
    public void fly(){
        System.out.println("This plane is flying");
    }
    @Override
    public void land(){
        System.out.println("This plane is landing");
    }
}
