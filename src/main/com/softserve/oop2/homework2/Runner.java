package com.softserve.oop2.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        WaterVehicle[] waterVehicles = new WaterVehicle[]{new Liner(5), new Boat(20)};
        FlyingVehicle[] flyingVehicles = new FlyingVehicle[]{new Plane(1200)};
        GroundVehicle[] groundVehicles = new GroundVehicle[]{new Bus("Petrovskaya"), new Motorcycle(270),
                new Car("Porche")};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write what kind of vehicle you prefer more(water, flying, ground): ");
        String vehicle = sc.nextLine();


        switch (vehicle) {
            case "water":
                for (int i = 0; i < waterVehicles.length; i++) {
                    System.out.println(waterVehicles[i]);
                    waterVehicles[i].isSailing();
                }
                break;
            case "flying":
                for (int i = 0; i < flyingVehicles.length; i++) {
                    System.out.println(flyingVehicles[i]);
                    flyingVehicles[i].fly();
                    flyingVehicles[i].land();
                }
                break;
            case "ground":
                for (int i = 0; i < groundVehicles.length; i++) {
                    System.out.println(groundVehicles[i]);
                    groundVehicles[i].drive();
                }
                break;
            default:
                System.out.println("wrong vehicle");
        }
    }
}
