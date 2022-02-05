package com.softserve.edu.homework11.HW1;

public class MessageThree implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread three run...");
        for (int i = 0; i < 5; i++) {
            System.out.println("Mclaren Senna?");
        }
    }
}
