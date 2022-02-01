package com.software.edu.hw13.homeWork3;

public class TwoThread implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");

        }
        Runnable r2 = new ThreeThread();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
