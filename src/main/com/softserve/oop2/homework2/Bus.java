package com.softserve.oop2.homework2;

public class Bus extends GroundVehicle{
    String route;

    public Bus(String route) {
        this.route = route;
        this.passengers = 28;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Working time from 8am to 8pm everyday.");
    }

    @Override
    public String toString() {
        return "\nBus: which goes directly to this route: " + route + ", and can keep this amount of passengers: " + getPassengers()+ ".";
    }
}
