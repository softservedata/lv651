package com.software.edu.hw08.homework2;

public class Bus extends GroundVehicle{

    private String route;

    public Bus(String route) {
        this.route = route;
        this.passengers = 26;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive(){
        System.out.println("Working time from 7:30 am to 8pm everyday.");

    }

    @Override
    public String toString() {
        return "Bus{" +
                "route='" + route + '\'' +
                ", passengers=" + passengers +
                '}';
    }
}
