package homework.hw06.practicaltasks.task1;

import java.util.Date;

public class Sedan extends Car{

    public final String model = "Sedan";
    private int maxSpeed;
    private int year;

    public Sedan() {
        this.maxSpeed = 0;
        this.year = new Date().getYear();
    }

    public Sedan(int maxSpeed, int year) {
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
