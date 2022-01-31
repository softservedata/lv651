package com.software.edu.hw13.homeWork1;

public class Runner {

    public static Object monitor = new Object();

    public static void main(String[] args) {

        Runnable r1 = new FirstThread();
        Thread t1 = new Thread(r1);

        Runnable r2 = new SecondThread();
        Thread t2 = new Thread(r2);

        Runnable r3 = new ThirdThread();
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
