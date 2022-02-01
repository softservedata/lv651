package com.software.edu.hw13.homeWork2;

public class SecondThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread = " + Thread.currentThread().getName());
        synchronized (Runner.first) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
            synchronized (Runner.second) {
                System.out.println("Success!");
            }
        }

    }

}
