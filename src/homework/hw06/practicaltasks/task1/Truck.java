package homework.hw06.practicaltasks.task1;

import java.util.Date;

public class Truck extends Car{

    public final String model = "Truck";
    private int maxSpeed;
    private int year;

    public Truck() {
        this.maxSpeed = 0;
        this.year = new Date().getYear();
    }

    public Truck(int maxSpeed, int year) {
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public void run(){
        System.out.println("run");
    };

    public void stop(){
        System.out.println("stop");
    };

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", year=" + year +
                '}';
    }
}
