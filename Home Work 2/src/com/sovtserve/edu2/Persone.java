package com.sovtserve.edu2;
import java.util.Scanner;

public class Persone {

    private  double totalSum;
    private String name;
    private int rate;
    private int houts;
    private float sum;


    public Persone() {
        name = "Ivvan";
        rate = 100;
        houts = 250;

    }

    public Persone(int rate, String name, int houts) {
        this.name = name;
        this.rate = rate;
        this.houts = houts;
    }

    public Persone(int rate, String name){

    }


    public int getRate() {
        return rate;
    }

    public int getHouts() {
        return houts;
    }

    public float getSum() {
        float s = getRate() * getHouts();
        return s;
    }

    public double getBonuses() {
        double k = (double) (getSum() * 0.10);
        return k;
    }


    public static void main(String[] args) {
        Persone a = new Persone(100, "Andriy", 230);
        Persone b = new Persone(120, "Mykola", 200);
        Persone c = new Persone(200, "Vasyl", 150);
        Persone d = new Persone();
        System.out.println(a.toString());
        System.out.println("ZP-" + a.name +"=" + a.getSum());
        System.out.println("Bonus-" + a.name+" =" + a.getBonuses());
        System.out.println(b.toString());
        System.out.println("ZP-" + b.name +" =" + b.getSum());
        System.out.println("Bonus-" + b.name +" =" + b.getBonuses());
        System.out.println(c.toString());
        System.out.println("ZP-" + c.name +" =" + c.getSum());
        System.out.println("Bonus-"+ c.name +" =" + c.getBonuses());
        System.out.println(d.toString());


    }

    public void setHours(int houts) {
        this.houts = houts;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }
    @Override
    public String toString() {
        return "Persone [name=" + name + ", rate=" + rate + ", houts=" + houts + "]";
    }

}
