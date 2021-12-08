package com.softserve.oop1.practicaltask1;

public class Sedan extends Car {
    public Sedan(String model, int maxSpeed, int yearOfManifacture) {
        super(model, maxSpeed, yearOfManifacture);
    }

    public String toString() {
        return "this is sedan: " + model + ".The year is: " + yearOfManifacture + " and max speedc is: " + maxSpeed;
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
        Sedan other = (Sedan) obj;
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
