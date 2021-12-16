package com.lect7.oop2.practicaltask.task2;

public class Teacher extends Stuff {
    private static final String TYPE_PERSONE = null;

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void salary() {
        int money = 18;
        System.out.println(TYPE_PERSONE+ " Have "+ money+ "$ per hour.");
    }

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return TYPE_PERSONE;
    }
}
