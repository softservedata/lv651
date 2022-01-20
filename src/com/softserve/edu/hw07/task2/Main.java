package com.softserve.edu.hw07.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        FlyingVehicle[] flyingVehicles = {new Helicopter(5,2,1000), new Plane(100,5000)};
        GroundVehicle[] groundVehicles = {new Bus(55, "Lviv - Kyjiv - Lviv"),new Car(5,"Volkswagen"), new Motorcycle(2,320)};
        WaterVehicle[] waterVehicles = {new Boat(200,10), new Liner(500, 15)};

        System.out.println("Write kind of travelling and see available transport (ground,water,air) or write ''thanks'' to stop finding process : ");
        Scanner sc = new Scanner(System.in);
        boolean n=true;
        while (n)
        {
            String m;
            m = String.valueOf(sc.next());
            switch (m){
                case "ground":
                    System.out.println(Arrays.toString(groundVehicles));
                    break;
                case "water":
                    System.out.println(Arrays.toString(waterVehicles));
                    break;
                case "air":
                    System.out.println(Arrays.toString(flyingVehicles));
                    break;
                case "thanks":
                    n=false;
                    System.out.println("Finding process was stopped.");
                    break;
            }

        }

    }
}