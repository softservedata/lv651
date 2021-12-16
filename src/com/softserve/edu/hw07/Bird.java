package com.softserve.edu.hw07;

public abstract class Bird {
    String feather;
    boolean layEggs;

    abstract String fly();

    public Bird() {
    }

    public Bird(String leather, boolean layEggs) {
        this.feather = leather;
        this.layEggs = layEggs;
    }

    public String getLeather() {
        return feather;
    }

    public void setLeather(String leather) {
        this.feather = leather;
    }

    public boolean getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "leather='" + feather + '\'' +
                ", layEggs=" + layEggs +
                '}';
    }
}