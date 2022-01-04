package homework.hw06.practicaltasks.task1;

import java.util.Date;

public class Sedan extends Car{

    public final String model = "Sedan";

    public Sedan() {
        super();
    }

    public Sedan(int maxSpeed, int year) {
        super(maxSpeed, year);
    }

    public void run(){
        System.out.println("run Sedan");
    }

    public void stop(){
        System.out.println("stop Sedan");
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", year=" + super.getYear() +
                '}';
    }
}
