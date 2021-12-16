package com.lect7.oop2.homeworks.task2;

public class Bus extends GroundVehicle{
    private String route;

    public Bus(){

    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    @Override
    public void drive() {
        System.out.println("Bus is drive" + route);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "route='" + route + '\'' +
                '}';
    }
}
