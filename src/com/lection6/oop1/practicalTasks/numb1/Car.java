package com.lection6.oop1.practicalTasks.numb1;

import java.util.Random;

public abstract class Car {
    private String nameModel;
    private static int counter = 1;
    private int speed;
    private int year;
    Random rand = new Random();

    public Car(){
        int i = rand.nextInt(3)+1;
        String mercedes = "Mercedes";
        String porch = "Porch";
        String lamba = "Lamba";
        year = rand.nextInt(40)+1980;
        speed = (year - 1850) + counter++;
        if (i == 1){
            nameModel = mercedes;
        } else if (i==2){
            nameModel = porch;
        } else {
            nameModel = lamba;
        }
        return;
    }

    public abstract String model();
    public abstract int maxSpeed ();
    public abstract int yearOfManufacture();

    public void run(){
        System.out.println("Code start running");
        this.speed = maxSpeed();

    }
    public void stop(){
        System.out.println("Code stop running");
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameModel='" + nameModel + '\'' +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
