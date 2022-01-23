package com.softserve.edu.hw12.HW1;

public class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread #1 start");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i= 0; i<5; i++) {
            System.out.println("1");
        }
        System.out.println("Thread #1 finash");

    }
}
