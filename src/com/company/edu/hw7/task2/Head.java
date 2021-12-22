package com.company.edu.hw7.task2;

public class Head {
    public static void main(String[] args) {
        WaterVehicle veh1=new Liner(3);
        WaterVehicle veh2=new Boat(60);
        FlyingVehicle veh3 = new Plane(3000);
        FlyingVehicle veh4 = new Helicopter(400, 600);
        GroundVehicle veh5 = new Bus("Levandivka-Chornovola");
        GroundVehicle veh6 = new Motorcycle(300);
        GroundVehicle veh7 = new Car("Porshepanamera");


Passengers[] arr= new Passengers[]{veh1, veh2, veh3, veh4, veh5, veh6, veh7};
for (int i=0; i< arr.length; i++)
{
    if(arr[i] instanceof FlyingVehicle){
        arr[i].fly();
        arr[i].land();
    }
    if(arr[i] instanceof GroundVehicle){
        arr[i].drive();
    }
    if(arr[i] instanceof WaterVehicle){
        arr[i].isSailing();
    }
}
    }
}
