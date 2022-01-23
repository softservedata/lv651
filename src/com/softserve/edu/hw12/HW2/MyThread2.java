package com.softserve.edu.hw12.HW2;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread = "  + Thread.currentThread().getName());
        synchronized (DeadLock.monitor2) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread.yield();
            synchronized (DeadLock.monitor1) {
                System.out.println("Success!");
            }
        }
    }
}
