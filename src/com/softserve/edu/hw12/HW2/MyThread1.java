package com.softserve.edu.hw12.HW2;

public class MyThread1 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread = " + Thread.currentThread().getName());
        synchronized (DeadLock.monitor1) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
            synchronized (DeadLock.monitor2) {
                System.out.println("Success!");
            }
        }
    }
}
