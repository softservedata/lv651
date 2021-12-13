package com.softserve.edu.hw05;

import java.util.Scanner;

public class Car {
    private  String type;
    private int year_of_prod;
    private float engine_capacity;

    public Car() {
    }

    public Car(String type, int year_of_prod, float engine_capacity) {
        this.type = type;
        this.year_of_prod = year_of_prod;
        this.engine_capacity = engine_capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear_of_prod(String next) {
        return year_of_prod;
    }

    public void setYear_of_prod(int year_of_prod) {
        this.year_of_prod = year_of_prod;
    }

    public float getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(float engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year_of_prod=" + year_of_prod +
                ", engine_capacity=" + engine_capacity +
                '}';
    }

    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        Car audi = new Car("A7",2017,2.0F);
        Car audi1 = new Car ("Q7", 2019,2.5F );
        Car audi2= new Car ("RS6", 2014, 3.2F);
        Car audi3 = new Car ("R8" , 2018, 4.0F);
        System.out.println("Enter the year of production (2014,2017,2018,2019): ");
        int n;
        n=scan.nextInt();
        switch (n)
        {
            case 2014:
                System.out.println("Type of audi : " + audi2.type + "\nEngine capacity : " + audi2.engine_capacity);
                break;
            case 2017:
                System.out.println("Type of audi : " + audi.type + "\nEngine capacity : " + audi.engine_capacity);
                break;
            case 2018:
                System.out.println("Type of audi : " + audi3.type + "\nEngine capacity : " + audi3.engine_capacity);
                break;
            case 2019:
                System.out.println("Type of audi : " + audi1.type + "\nEngine capacity : " + audi1.engine_capacity);
                break;
        }
        System.out.println("Sorted cars be year: ");
    Car[] arr = {audi1, audi, audi2, audi3};
        Car tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].year_of_prod < arr[j].year_of_prod) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }

    }

}
