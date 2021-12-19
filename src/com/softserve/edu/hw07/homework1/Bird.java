package com.software.edu.hw07.homework1;

public abstract class Bird {
    public String feathers;
    boolean layEggs;

    abstract String fly();

    public Bird(){

    }

    public Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feathers='" + feathers + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}

