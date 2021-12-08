package com.softserve.oop1.practicaltask1;

public class Truck extends Car {

    public void run() {
        System.out.println("the car is started!");
    }

    public Truck(String model, int maxSpeed, int yearOfManifacture) {
        super(model, maxSpeed, yearOfManifacture);
    }

    public String toString() {
        return "this is truck: " + model + ".The year is: " + yearOfManifacture + " and max speedc is: " + maxSpeed;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Truck other = (Truck) obj;
        if (yearOfManifacture != other.yearOfManifacture) {
            return false;
        }
        if (!model.equals(other.model)) {
            return false;
        }
        if(maxSpeed != other.maxSpeed) {
            return false;
        }
        return true;
    }

}
