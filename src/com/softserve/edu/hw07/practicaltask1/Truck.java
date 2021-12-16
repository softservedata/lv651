package com.software.edu.hw07.practicaltask1;

public class Truck extends Car{
    public Truck(String model, int maxSpeed, int yearOfManufacture) {

        super(model, maxSpeed, yearOfManufacture);
    }

    public String toString(){
        return "this is truck: " + model + ".The year is: " + yearOfManufacture + " and max speedc is: " + maxSpeed;
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
        if (yearOfManufacture != other.yearOfManufacture) {
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
