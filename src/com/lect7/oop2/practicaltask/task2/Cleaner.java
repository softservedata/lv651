package com.lect7.oop2.practicaltask.task2;

public class Cleaner extends Stuff {
    private static final String TYPE_PERSONE = null;

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void salary() {
        int money = 14;
        System.out.println(TYPE_PERSONE+ " Have "+ money+ "$ per hour.");
    }

    public Cleaner(String name) {
        super(name);
    }
}
