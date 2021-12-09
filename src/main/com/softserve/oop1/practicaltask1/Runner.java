package com.softserve.oop1.practicaltask1;

public class Runner {


    private static Truck truck1 = new Truck("Ford ", 180, 2000);
    private static Truck truck2 = new Truck("Ram", 200, 2005);
    private static Truck truck3 = new Truck("Toyota", 220, 2010);

    private static Sedan sedan1 = new Sedan("Hyundai", 200, 2008);
    private static Sedan sedan2 = new Sedan("Kia Rio", 190, 2015);
    private static Sedan sedan3 = new Sedan("Mazda", 2010, 2020);


    public static void main(String[] args) {
        Car[] cars = new Car[]{sedan2, truck2, truck3, truck1, sedan3, sedan1};

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] instanceof Truck) {
                System.out.println(cars[i]);
            }
        }

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] instanceof Sedan) {
                System.out.println(cars[i]);
            }
        }
    }


}
