package com.company.edu.hw5;

public /*enum*/ class Car {
    /*MITSUBISHI(2019),
    BMW(2020),
    PORSHEPANAMERA(2017),
    AUDI(2018);

    Car(int year) {
        this.year = year;
    }*/

    private String type;
private int year;
private float capacity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    Car(String type, int year, float capacity) {
        this.type = type;
        this.year = year;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                '}';
    }

    Car()  {
        type="";
        year=0;
        capacity=0;
    }
    /*public Car ModelbyYear(int year) {
        if(year==2020){
            return BMW;
        }
        if(year==2019){
            return MITSUBISHI;
        }
        if(year==2018){
            return AUDI;
        }
        if(year==2017){
            return PORSHEPANAMERA;
        }
        return null;
    }*/
}
