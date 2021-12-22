package com.company.edu.hw7.task2;

public abstract class Passengers  {
    int passengers;

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public Passengers() {

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }


    public void fly(){}
    public void land(){}

    public void isSailing(){}

    public void drive(){}
}
