package com.softserve.edu.hw12.HW1;

public class Appl {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Thread = "  + Thread.currentThread().getName());

        Runnable r1 =  new MyThread1();
        Thread t1  = new Thread(r1);

        Runnable r2 =  new MyThread2();
        Thread t2  = new Thread(r2);

        Runnable r3 =  new MyThread3();
        Thread t3  = new Thread(r3);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        t3.start();

    }
}
