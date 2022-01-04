package homework.hw06.practicaltasks.task1;

import java.util.Date;

public class Truck extends Car{

    public final String model = "Truck";

    public Truck() {
        super();
    }

    public Truck(int maxSpeed, int year) {
        super(maxSpeed, year);
    }

    public void run(){
        System.out.println("run Truck");
    }

    public void stop(){
        System.out.println("stop Truck");
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
