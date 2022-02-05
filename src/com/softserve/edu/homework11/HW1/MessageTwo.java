package com.softserve.edu.homework11.HW1;

public class MessageTwo implements Runnable{
    @Override
    public void run() {
        synchronized (Main.monitor) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread two run...");
            for (int i = 0; i < 5; i++) {
                System.out.println("Toyota Supra...");
            }
        }
    }
}
