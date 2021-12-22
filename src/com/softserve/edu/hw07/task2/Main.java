package com.softserve.edu.hw07.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
FlyingVehicle[] flyingVehicles = {new Helicopter(2,3,2000), new Plane(300,4000)};
GroundVehicle[] groundVehicles = {new Bus(50, "66"),new Car(5,"Audi"), new Motorcycle(2,400)};
WaterVehicle[] waterVehicles = {new Boat(100,10), new Liner(600, 10)};

        System.out.println("Choose kind of travelling and see available transport (ground,water,air) : ");
        Scanner sc = new Scanner(System.in);
        boolean n=true;
        while (n)
        {
            String m;
            m = String.valueOf(sc.next());
            switch (m){
                case "ground":
                    System.out.println(Arrays.deepToString(groundVehicles));
                    break;
                case "water":
                    System.out.println(Arrays.toString(waterVehicles));
                    break;
                case "air":
                    System.out.println(Arrays.toString(flyingVehicles));
                    break;
                case "stop":
                    n=false;
                    System.out.println("...");
                    break;
            }

        }

    }
}
