package com.lection6.oop1.practicalTasks.numb1;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        Car[] cars = new Sedan[]{new Sedan(), new Sedan(), new Sedan()};
        System.out.println(Arrays.toString(cars));
        Car[] car = new Truck[]{new Truck(1), new Truck(2), new Truck(3)};
        System.out.println(Arrays.toString(car));
    }
}
