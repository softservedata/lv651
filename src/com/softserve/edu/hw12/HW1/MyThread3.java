package com.softserve.edu.hw12.HW1;

public class MyThread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread #3 start");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i= 0; i<5; i++) {
            System.out.println("3");
        }
        System.out.println("Thread #3 finash");
    }
}
