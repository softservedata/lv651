package com.lect7.oop2.practicaltask.task2;

public abstract class Stuff extends Persone {
//    private int money;
//    public void salary(int money){
//        this.money = money;
//    };
//
//    public int getMoney() {
//        return money;
//    }
//
//    public void setMoney(int money) {
//        this.money = money;
//    }
    public abstract void salary();

    public Stuff(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I am a " + getName());
    }
}
