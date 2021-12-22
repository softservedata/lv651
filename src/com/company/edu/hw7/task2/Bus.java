package com.company.edu.hw7.task2;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("This Bus is riding");
    }
}
