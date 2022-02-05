package com.softserve.edu.homework11.HW1;

public class MessageOne implements Runnable {
    @Override
    public void run() {
        synchronized (Main.monitor) {
            System.out.println("Thread one run...");
            for (int i = 0; i < 5; i++) {
                System.out.println("Nissan GTR r-35!");
            }
        }
    }
}