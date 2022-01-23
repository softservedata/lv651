package com.softserve.edu.hw12.HW2;


public class DeadLock {
    public static final Object monitor1 = new Object();
    public static final Object monitor2 = new Object();

    public static void main(String[] args) {
        System.out.println("Thread = "  + Thread.currentThread().getName());

        Runnable r1 = new MyThread1();
        Thread t1 = new Thread(r1);

        Runnable r2 = new MyThread2();
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("ZBS");






    }
}
