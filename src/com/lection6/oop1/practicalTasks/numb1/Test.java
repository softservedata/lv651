package com.lection6.oop1.practicalTasks.numb1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {
    private static int size;
    private static Car[] cars = new Car[4];
    private static Truck[] trucks;
    private static Random random = new Random();
    private static void generateCars () {
        size = random.nextInt(100) + 3;
        cars = new Car[size];
        for (int i = 0; i < cars.length; i++) {
            if (random.nextInt(2) == 0) {
                cars[i] = new Sedan();
            } else {
                cars[i] = new Truck();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(size);
        generateCars();
        List<Truck> trucks = new ArrayList<>();
        List<Sedan> sedans = new ArrayList<>();

        for (int i = 0; i < cars.length; i++) {
            Car carsInArray = cars[i];
            if (carsInArray instanceof Truck) {
                Truck truckInArray = new Truck();
                trucks.add(truckInArray);
            }
        }
        for (int i = 0; i < cars.length; i++) {
            Car carsInArray = cars[i];
            if (carsInArray instanceof Sedan) {
                Sedan sedanInArray = new Sedan();
                sedans.add(sedanInArray);
            }
        }
        System.out.println(sedans);
        System.out.println("Дальше будут траки");
        System.out.println(trucks);
    }}
