package com.software.edu.hw06;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Car {
    private  double engine_capacity;
    private int yearOfProduction;

    public Car(Double engine_capacity, int yearOfProduction) {
        this.engine_capacity = engine_capacity;
        this.yearOfProduction = yearOfProduction;
    }


    public Double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(Double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }


    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{ capacity='" + engine_capacity + '\'' +
                ", year=" + yearOfProduction +
                '}';
    }

    public static void main(String[] args) throws IOException{
        Car [] car = new Car[4];
        car[0] = new Car(2.1,1998);
        car[1] = new Car(4.5,2021);
        car[2] = new Car(3.8,2009);
        car[3] = new Car(0.1,1990);
        System.out.println(Arrays.toString(car));

        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Which one car would you like? \nEnter the year of prodaction: ");
        int x = Integer.parseInt(be.readLine());
        switch (x){
            case 1990:
                System.out.println("You bought "+ car[3]);
                break;
            case 1998:
                System.out.println("You bought "+ car[0]);
                break;
            case 2009:
                System.out.println("You bought "+ car[2]);
                break;
            case 2021:
                System.out.println("You bought "+ car[1]);
            default:
                System.out.println("Sorry, \nbut we don`t have any car from that year...");
        }
    }
}
