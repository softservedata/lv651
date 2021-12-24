package com.software.edu.hw08.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        WaterVehicle[] waterVehicles = new WaterVehicle[]{new Liner(5), new Boat(20)};
        FlyingVehicle[] flyingVehicles = new FlyingVehicle[]{new Plane(1200)};
        GroundVehicle[] groundVehicles = new GroundVehicle[]{new Bus("Bogdan"), new Motorcycle(270),
                new Car("Tesla")};

        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        System.out.print("Please write what kind of vehicle you prefer more(water, flying, ground): ");
        String vehicle = br.readLine();


        switch (vehicle) {
            case "water":
                for (int i = 0; i < waterVehicles.length; i++) {
                    System.out.println("\n"+waterVehicles[i]);
                    waterVehicles[i].isSalling();
                }
                break;
            case "flying":
                for (int i = 0; i < flyingVehicles.length; i++) {
                    System.out.println("\n"+flyingVehicles[i]);
                    flyingVehicles[i].fly();
                    flyingVehicles[i].land();
                }
                break;
            case "ground":
                for (int i = 0; i < groundVehicles.length; i++) {
                    System.out.println("\n"+groundVehicles[i]);
                    groundVehicles[i].drive();
                }
                break;
            default:
                System.out.println("wrong vehicle");
        }
    }
}
