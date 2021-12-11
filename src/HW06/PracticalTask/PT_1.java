package HW06.PracticalTask;

import HW05.HomeTask.CarProducer;
import HW05.HomeTask.CarType;

public class PT_1 {
    /*
    1. Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
    Develop classes Truck and Sedan which extend class Car.
    In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it
    */
    public static void main(String[] args) {
        CarSet carSet = new CarSet(new Car[]{
                new Truck(CarProducer.MAN, 2017, 45),
                new Truck(CarProducer.RENAULT, 2007, 40),
                new Sedan(CarProducer.HONDA, 2007, 5),
                new Sedan(CarProducer.OPEL, 1982, 8)
        });
        System.out.println(carSet);
        System.out.println("Cars sorted by year:");
        carSet.sortAscByYear();
        System.out.println(carSet);
    }
}

abstract class Car {
    public CarProducer model;
    public int maxSpeed;
    public int currentSpeed;
    public int yearOfManufacture;
    public CarType carType;

    public Car(CarProducer model, CarType carType, int yearOfManufacture) {
        this.model = model;
        this.carType = carType;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
        this.currentSpeed = 0;
    }

    abstract void run();

    abstract void stop();

    public CarProducer getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getYear() {
        return yearOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed < this.maxSpeed)
            this.currentSpeed = currentSpeed;
        else
            this.currentSpeed = this.maxSpeed;
    }
}

class Truck extends Car {
    private final int DEFAULT_MAX_SPEED = 140;
    private int carrying;                               //вантажопідйомність
    private EngineType eType;                           //тип двигуна

    public Truck(CarProducer model, int yearOfManufacture, int carrying) {
        super(model, CarType.TRUCK, yearOfManufacture);
        super.maxSpeed = DEFAULT_MAX_SPEED;
        this.carrying = carrying;
        this.eType = EngineType.DIESEL;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model=" + model +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                ", carrying=" + carrying +
                ", eType=" + eType +
                '}';
    }

    @Override
    void run() {
        System.out.println("Truck " + model + " is running.");
    }

    @Override
    void stop() {
        setCurrentSpeed(0);
        System.out.println("Truck " + model + " is stopped.");
    }
}

class Sedan extends Car {
    private final int DEFAULT_MAX_SPEED = 240;
    private int seatsNumber;
    private EngineType eType;

    public Sedan(CarProducer model, int yearOfManufacture, int seatsNumber) {
        super(model, CarType.SEDAN, yearOfManufacture);
        super.maxSpeed = DEFAULT_MAX_SPEED;                 //Can't use constructor!!!
        this.seatsNumber = seatsNumber;
        this.eType = EngineType.FUEL;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model=" + model +
                ", maxSpeed=" + maxSpeed +
                ", yearOfManufacture=" + yearOfManufacture +
                ", seatsNumber=" + seatsNumber +
                ", eType=" + eType +
                '}';
    }

    @Override
    void run() {
        System.out.println("Sedan " + model + " is running.");
    }

    @Override
    void stop() {
        setCurrentSpeed(0);
        System.out.println("Sedan " + model + " is stopped.");
    }
}

enum EngineType {
    FUEL,
    DIESEL
}