package com.softserve.edu.homework11.HW1;

public class Main {

    public static Object monitor = new Object();

    public static void main(String[] args) {

        Runnable r1 = new MessageOne();
        Thread t1 = new Thread(r1);

        Runnable r2 = new MessageTwo();
        Thread t2 = new Thread(r2);

        Runnable r3 = new MessageThree();
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}


