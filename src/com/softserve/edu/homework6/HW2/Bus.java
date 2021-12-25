package com.softserve.edu.homework6.HW2;

public class Bus extends GroundVehicle {
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
    void drive() {
    }
}
