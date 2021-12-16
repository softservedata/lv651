package com.lect7.oop2.practicaltask.task2;

public abstract class Persone {
    private String name;

    public Persone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void print();

    @Override
    public String toString() {
        return "Persone{" +
                "name='" + name + '\'' +
                '}';
    }
}
