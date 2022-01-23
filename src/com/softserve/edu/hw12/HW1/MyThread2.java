package com.softserve.edu.hw12.HW1;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread #2 start");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i= 0; i<5; i++) {
            System.out.println("2");
        }
        System.out.println("Thread #2 finash");
    }
}
