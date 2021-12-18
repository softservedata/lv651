package com.softserve.edu.homework4;

public class Car {
    String name;
    int yerOfProduction;
    double engineCapacity;

    public Car(String name, int yerOfProduction, double engineCapacity) {
        this.name = name;
        this.yerOfProduction = yerOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYerOfProduction() {
        return yerOfProduction;
    }

    public void setYerOfProduction(int yerOfProduction) {
        this.yerOfProduction = yerOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yerOfProduction != car.yerOfProduction) return false;
        if (Double.compare(car.engineCapacity, engineCapacity) != 0) return false;
        return name.equals(car.name);
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + yerOfProduction;
        temp = Double.doubleToLongBits(engineCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yerOfProduction=" + yerOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
